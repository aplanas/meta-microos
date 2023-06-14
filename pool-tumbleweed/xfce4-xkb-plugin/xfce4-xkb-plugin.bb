SUMMARY = "XKB Layout Switcher Plugin for the Xfce Panel"
DESCRIPTION = "The XKB plugin allows to setup and switch between multiple XKB keyboard \
layouts."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "xfce4-xkb-plugin-0.8.3-1.4.aarch64.rpm"
RPM_HASH = "f568d26bd93d6a000898b3d4d6c394529e4adc06bbeca8580454a633f0f94557c8569c95c41962710c0e44d3239e77d51fb0e00732694a70949ae19df3fd7226"

RPROVIDES:${PN} += "libxkb.so \
xfce4-panel-plugin-xkb \
xfce4-xkb-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libwnck-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxklavier.so.16 \
xfce4-panel \
xfce4-settings"

inherit rpm
