SUMMARY = "Set of Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua-3.1.0.0+42-2.3.aarch64.rpm"
RPM_HASH = "a51d1710b67b8ae75e33d51172573b145aa43b6b375d1490790b4eebc7ee2738afeda0cf4b92d270652766133c8fcf55e6ad95717e81608a7b18c309c99cbf5d"

RPROVIDES:${PN} += "libwx.so \
libwxlua"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-gl-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-media-suse.so.9.0.0 \
libwx-gtk3u-stc-suse.so.9.0.0 \
libwx-gtk3u-webview-suse.so.9.0.0 \
libwx-gtk3u-xrc-suse.so.9.0.0 \
libwxlua-bind-wx32-3-1-0-0 \
libwxlua-debug-wx32-3-1-0-0 \
libwxlua-debugger-wx32-3-1-0-0 \
libwxlua-wx32-3-1-0-0"

inherit rpm
