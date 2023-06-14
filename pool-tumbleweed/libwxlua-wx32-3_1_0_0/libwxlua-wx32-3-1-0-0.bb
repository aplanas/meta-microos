SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua-wx32-3_1_0_0-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "06aa0e0e02329ba0386c703ff7e4854dd9bab374c01703b38d015c82585714f4236b11ec2defb869ef277b8873c60ce21d6f5efabcdacc1b574b9f7274b448f2"

RPROVIDES:${PN} += "libwxlua-wx32-3-1-0-0 \
libwxlua-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
