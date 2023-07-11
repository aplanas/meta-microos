SUMMARY = "Eog exif-display plugin"
DESCRIPTION = "The Eye of Gnome exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-exif-display-44.0-1.2.aarch64.rpm"
RPM_HASH = "3c4cf3d123625c7502de97a029f57a79de9c45fa57f58224fea53e576cf1ac494e73f39a595fead6e8a84cdcc4ff109a4e8478e908efcdd10a5c98a1fa5017b7"

RPROVIDES:${PN} += "eog-plugin-exif-display \
eog-plugins-/usr/lib64/eog/plugins/exif-display.plugin \
libexif-display.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libeog.so \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0"

inherit rpm
