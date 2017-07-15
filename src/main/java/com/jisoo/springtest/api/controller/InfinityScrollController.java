package com.jisoo.springtest.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * AUTH: JiSoo Yoon
 * MODIFY:
 * DESC:
 * TODO:
 */
@Controller
public class InfinityScrollController {
//    @RequestMapping("/")
//    public String home() {
//        return "index";
//    }

    @RequestMapping("/paging")
    public String paging() {
        return "infinityScroll";
    }
}
