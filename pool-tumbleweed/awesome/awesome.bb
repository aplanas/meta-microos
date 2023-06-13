SUMMARY = "Configurable tiling and floating Window Manager"
DESCRIPTION = "awesome is a dynamic window manager. \
 \
It manages windows in several layout modes: tiled, floating, etc. \
Each layout can be applied dynamically, optimizing the environment \
for the application in use and the task performed."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "awesome-4.3-4.13.aarch64.rpm"
RPM_HASH = "75650b978328d2c9accfdea39c0b0b91737f871b40f3c5258bd308b5d5302bf26f8d3d358642cc7177c62dd366ef1ae6980454480de2a859f9a2344e8d47be0e"

RPROVIDES:${PN} += "awesome \
awesome(aarch-64) \
windowmanager"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
awesome-branding \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xinerama.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb-xrm.so.0()(64bit) \
libxcb-xtest.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxdg-basedir.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
lua-lgi \
typelib(GLib) \
typelib(Gio) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
update-alternatives"

inherit rpm
