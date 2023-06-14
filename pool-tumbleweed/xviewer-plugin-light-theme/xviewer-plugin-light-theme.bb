SUMMARY = "Xviewer light-theme plugin"
DESCRIPTION = "xviewer Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-light-theme-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "895c39a52da6edf7b9b2ba9a77e547d1429e4c22f742d14086f6de383d449a25081362f743b4b0c3c44edaa7452a2ba4a10fdf026339168d3064c92cc8c7d8f8"

RPROVIDES:${PN} += "liblight-theme.so \
xviewer-plugin-light-theme \
xviewer-plugins-/usr/lib64/xviewer/plugins/light-theme.plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xviewer-plugins-data"

inherit rpm
