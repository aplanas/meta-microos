SUMMARY = "A GTK4 BitTorrent Client"
DESCRIPTION = "Fragments is an easy to use BitTorrent client which follows the \
GNOME HIG and includes well thought-out features."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "Fragments-2.1-3.1.aarch64.rpm"
RPM_HASH = "4cf16049dcb9d8640855ece822d17fdeb4ebe551c173dc928eb0cd2a6a9b09eadff6b6c5c1370d5b1acdb2e4fd9ad17ea375dd89c4621689ef526cd39ee6b46d"

RPROVIDES:${PN} += "Fragments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libssl.so.3 \
libz.so.1 \
transmission-daemon"

inherit rpm
