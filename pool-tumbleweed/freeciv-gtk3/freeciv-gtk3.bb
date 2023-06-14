SUMMARY = "Gtk3 client for freeciv"
DESCRIPTION = "Freeciv executable using Gtk3 library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-gtk3-3.0.7-1.2.aarch64.rpm"
RPM_HASH = "9123beaddb61b418978fb50d03edc768ba5fbde64dcbdbc1336a4275a7bb30f593be3699ceb3fe287a8b634f9e0a749edcf58f40df0906b9d6dc7453ab85722e"

RPROVIDES:${PN} += "freeciv-client-3.0.7 \
freeciv-gtk3"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
