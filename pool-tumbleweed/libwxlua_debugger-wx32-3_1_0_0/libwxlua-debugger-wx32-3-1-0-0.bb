SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-WITH-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_debugger-wx32-3_1_0_0-3.1.0.0+42-2.2.aarch64.rpm"
RPM_HASH = "932f2aa4def66b8d0fee1449a4b40223431975f90aff8bf7308abd67afd375b6795e5c95c248e1f859b3863ac0545b92ab311a5df486586a4973242ec75d6a7e"

RPROVIDES:${PN} += "libwxlua-debugger-wx32-3-1-0-0 \
libwxlua-debugger-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwxlua-bind-wx32gtk3u-3.1.0.0.so \
libwxlua-debug-wx32gtk3u-3.1.0.0.so \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
