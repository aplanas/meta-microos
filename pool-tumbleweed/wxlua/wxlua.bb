SUMMARY = "Lua bindings for wxWidgets"
DESCRIPTION = "Lua bindings for wxWidgets cross-patform GUI toolkit; \
supports Lua 5.1, 5.2, 5.3, 5.4, LuaJIT and wxWidgets 3.x"
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "56863577ff14a96ceee5967dac77e87f57f28b8f7dc9b2e888ba9960fe669c2065732a335747760e97c6fb8a9382c7d1b16b93eb6c93764cc281dde492932321"

RPROVIDES:${PN} += "application() \
application(wxlua.desktop) \
mimehandler(application/lua) \
wxlua \
wxlua(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
liblua5.4.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwxlua-wx32gtk3u-3.1.0.0.so()(64bit) \
libwxlua_bind-wx32gtk3u-3.1.0.0.so()(64bit) \
libwxlua_debugger-wx32gtk3u-3.1.0.0.so()(64bit)"

inherit rpm
