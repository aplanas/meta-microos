SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua-wx32-3_1_0_0-3.1.0.0+42-2.3.aarch64.rpm"
RPM_HASH = "f7f727aca1c7c4ce17ef3e0616d5c57acc4fd267d7a07092ac728aa35348babc09b9ad473caaeb98d5aca497a75199e3fb77717f827927f4cda1fab221ca394f"

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
