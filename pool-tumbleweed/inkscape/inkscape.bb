SUMMARY = "Vector Illustration Program"
DESCRIPTION = "Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-1.2.2-3.5.aarch64.rpm"
RPM_HASH = "1702f1b58a664bb4719966ad23e1e32d33552bfdea4f5db3dcbad8682d4328c2a09766b17113d8c74f4400a54e28e3d93ee83abc725dd36c4c9c8bf142632f1a"

RPROVIDES:${PN} += "inkscape \
libinkscape-base.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
lib2geom.so.1.3.0 \
libGraphicsMagick++-Q16.so.12 \
libX11.so.6 \
libatkmm-1.6.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcdr-0.1.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgc.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libharfbuzz.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangomm-1.4.so.1 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libpoppler.so.130 \
libpotrace.so.0 \
libreadline.so.8 \
librevenge-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libsigc-2.0.so.0 \
libsoup-2.4.so.1 \
libstdc++.so.6 \
libvisio-0.1.so.1 \
libwpg-0.3.so.3 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
python-abi \
python3-gobject"

inherit rpm
