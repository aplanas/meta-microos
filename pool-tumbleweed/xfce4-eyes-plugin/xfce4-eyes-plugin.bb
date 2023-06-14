SUMMARY = "Eyes Plugin for the Xfce Panel"
DESCRIPTION = "The Eyes plugin adds moving eyes to the panel which watch your activities."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "xfce4-eyes-plugin-4.6.0-1.7.aarch64.rpm"
RPM_HASH = "cd64de31805644604560ab6476d86320db7cbc2ae4f583a2326ed9fff6f21e3807af8dec340e90068bd2a0f9bd4cc09932f0af3a1bc83c65369d59d96a2a0a25"

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
