SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_bind-wx32-3_1_0_0-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "b2f6640a7497523d55dba6e62a0c2ee547594afc41abb6278f4c1e1b3f4fa96d3f48e96f2fb04c19e38c1196b37c9f1c6d0c92860bdb828e3242ab02101e614e"

RPROVIDES:${PN} += "libwxlua_bind-wx32-3_1_0_0 \
libwxlua_bind-wx32-3_1_0_0(aarch-64) \
libwxlua_bind-wx32gtk3u-3.1.0.0.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_media-suse.so.9.0.0()(64bit) \
libwx_gtk3u_media-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0()(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0(WXU_3.2)(64bit) \
libwxlua-wx32gtk3u-3.1.0.0.so()(64bit)"

inherit rpm
