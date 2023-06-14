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
windowmanager"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
awesome-branding \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblua5.4.so.5 \
libstartup-notification-1.so.0 \
libxcb-cursor.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb-xtest.so.0 \
libxcb.so.1 \
libxdg-basedir.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
lua-lgi \
typelib-GLib \
typelib-Gio \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
update-alternatives"

inherit rpm
