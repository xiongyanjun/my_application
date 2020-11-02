package com.xiong.my_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xiongyanjun  Date: 2020/11/2 ProjectName: settleprovisions Version: 1.0
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String name,String pwd,String code){
        System.out.println(name + pwd + code);
        return "index";
    }
}
