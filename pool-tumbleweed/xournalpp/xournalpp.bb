SUMMARY = "Notetaking software designed around a tablet"
DESCRIPTION = "Xournal++ is a hand note taking software. \
It supports pen input, e.g. Wacom tablets."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xournalpp-1.1.3-2.1.aarch64.rpm"
RPM_HASH = "cd370077f1aade89cc7c71ffc29f7ae99dc42ddeba17d7d3b721cf2939f6d1461da716e26fd1649ec752b0fff48ed5d9e212115689bfa7d91ea62f23a960f8b6"

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
