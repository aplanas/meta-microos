SUMMARY = "Xviewer exif-display plugin"
DESCRIPTION = "xviewer exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-exif-display-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "48096d5c17bfc9cfbc2f40586034d80dffa1b57862b90198e7cff8fdfeaa37ddd4251f3b9db8236548547810c9c3670e77ef3e4d7d1b195f380431aecf0cdc76"

RPROVIDES:${PN} += "libexif-display.so \
xviewer-plugin-exif-display \
xviewer-plugins-/usr/lib64/xviewer/plugins/exif-display.plugin"

RDEPENDS:${PN} += "/bin/sh \
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
