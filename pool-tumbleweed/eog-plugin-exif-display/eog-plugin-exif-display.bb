SUMMARY = "Eog exif-display plugin"
DESCRIPTION = "The Eye of Gnome exif display plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-exif-display-44.0-1.1.aarch64.rpm"
RPM_HASH = "bb3e00e741b7d182e0df78988e3e23ff5ed34ab6d70d00f72c9910833c13bd062a330509b3883b7c5b00e6a0fc1946f28ee0db3677d78a43aab3c41902d96dde"

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
