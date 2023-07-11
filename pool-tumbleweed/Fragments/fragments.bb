SUMMARY = "A GTK4 BitTorrent Client"
DESCRIPTION = "Fragments is an easy to use BitTorrent client which follows the \
GNOME HIG and includes well thought-out features."
LICENSE = "GPL-3.0-only"

PV = "2.1.1"

RPM_NAME = "Fragments-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "e48ec708d2236485f54ac77344d4ac8c4bae09099a1d8c1738fe7c73caf4eaef540a0cc49a2847f6b820bf2656ce61aed4d280de44d570b21de2b4411385d35c"

RPROVIDES:${PN} += "Fragments"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
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
