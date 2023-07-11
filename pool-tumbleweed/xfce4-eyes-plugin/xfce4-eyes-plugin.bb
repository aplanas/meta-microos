SUMMARY = "Eyes Plugin for the Xfce Panel"
DESCRIPTION = "The Eyes plugin adds moving eyes to the panel which watch your activities."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "xfce4-eyes-plugin-4.6.0-1.8.aarch64.rpm"
RPM_HASH = "fdc26b025916a2d81b805847709b7987322c14fe839dcbde8cd5c28d7f6c6bdbd78044a49c8cd5d4240b5555a019fae7b29335638db60c62d1726a8930c8d1b8"

RPROVIDES:${PN} += "libeyes.so \
xfce4-eyes-plugin \
xfce4-panel-plugin-eyes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
