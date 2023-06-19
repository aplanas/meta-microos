SUMMARY = "Lua bindings for wxWidgets"
DESCRIPTION = "Lua bindings for wxWidgets cross-patform GUI toolkit; \
supports Lua 5.1, 5.2, 5.3, 5.4, LuaJIT and wxWidgets 3.x"
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "56863577ff14a96ceee5967dac77e87f57f28b8f7dc9b2e888ba9960fe669c2065732a335747760e97c6fb8a9382c7d1b16b93eb6c93764cc281dde492932321"

RPROVIDES:${PN} += "wxlua"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwxlua-bind-wx32gtk3u-3.1.0.0.so \
libwxlua-debugger-wx32gtk3u-3.1.0.0.so \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
