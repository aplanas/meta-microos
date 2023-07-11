SUMMARY = "Xviewer exif-display plugin"
DESCRIPTION = "xviewer exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-exif-display-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "fb0e55154df78398bf98b0a32a730645cd3c56cd0cce9351e4306d8399cc1cc5f614b28cc440aa8c6f95fddd625b163641295fce1e6a8be9a92e938468bdfe32"

RPROVIDES:${PN} += "libexif-display.so \
xviewer-plugin-exif-display \
xviewer-plugins-/usr/lib64/xviewer/plugins/exif-display.plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
xviewer-plugins-data"

inherit rpm
