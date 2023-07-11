SUMMARY = "Notetaking software designed around a tablet"
DESCRIPTION = "Xournal++ is a hand note taking software. \
It supports pen input, e.g. Wacom tablets."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xournalpp-1.1.3-2.2.aarch64.rpm"
RPM_HASH = "49d87a175155a91bcae512df23f301b436839e1fd4867a920921ab0abaa6bf724be000709825712a7a0727d1960b199a72386a7540a1a8abaecc18549e88976e"

RPROVIDES:${PN} += "xournalpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpoppler-glib.so.8 \
libportaudio.so.2 \
libportaudiocpp.so.0 \
librsvg-2.so.2 \
libsndfile.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1 \
libzip.so.5"

inherit rpm
