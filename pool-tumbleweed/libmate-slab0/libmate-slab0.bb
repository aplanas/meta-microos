SUMMARY = "MATE Desktop libslab port"
DESCRIPTION = "This library makes it easy to create tile-based UI for MATE, as seen in \
gnome-main-menu."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmate-slab0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "7fc6fd68d0e59044e41e54343a7506970b20d05cc488b83e5a6ccc5f0027627ad1d465276da95a5fdce93b105069d31dbdd8f56e499d8da86710ff7c9ae37417"

RPROVIDES:${PN} += "libmate-slab.so.0 \
libmate-slab0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
libmate-menu.so.2"

inherit rpm
