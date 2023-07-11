SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_debug-wx32-3_1_0_0-3.1.0.0+42-2.3.aarch64.rpm"
RPM_HASH = "1033ac87879ff8d0fc401864090b4e89eb64a6861fb0e257b764450caf36647e0dea383963409b09a6fcda80d69c3c95bd4f836850f8ab6459919ce3105795a6"

RPROVIDES:${PN} += "libwxlua-debug-wx32-3-1-0-0 \
libwxlua-debug-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
