SUMMARY = "Generic Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Generic Monitor plugin is intended for custom monitoring tasks and \
periodically spawns a given application, captures its output and displays the \
result in form of an image, a bar, a button and a personalized tooltip in the \
panel."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "xfce4-genmon-plugin-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "77ca3cd5a2c21b43c5e7d082b762e5fdc6e4a747dc908a5c2725dd2d95146fa21d7dfb8556267921782cf18246a3d11190d22cf401378bbc7815d3291d1539b7"

RPROVIDES:${PN} += "libgenmon.so \
xfce4-genmon-plugin \
xfce4-panel-plugin-genmon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
