SUMMARY = "Xviewer light-theme plugin"
DESCRIPTION = "xviewer Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-light-theme-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "c7a0604ad62418c55988f0e606604944bbe04a2148a0f310831e929353d585e30fbb9abb78e0b857730dd5213afcaee0034e461f627bf0d70ff6f318238eb2cb"

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
