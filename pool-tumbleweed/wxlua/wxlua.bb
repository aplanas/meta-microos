SUMMARY = "Lua bindings for wxWidgets"
DESCRIPTION = "Lua bindings for wxWidgets cross-patform GUI toolkit; \
supports Lua 5.1, 5.2, 5.3, 5.4, LuaJIT and wxWidgets 3.x"
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-3.1.0.0+42-2.3.aarch64.rpm"
RPM_HASH = "7648a58d726cb75046e2aa74afc442c6d9bc71ee794e061fdb0ad4779d01e21935b7ce1a6529d287d344b3d2e319994a14ec63cb7b41dc303b3f5b0823b042e4"

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
