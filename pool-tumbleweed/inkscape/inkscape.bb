SUMMARY = "Vector Illustration Program"
DESCRIPTION = "Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-1.2.2-3.1.aarch64.rpm"
RPM_HASH = "93a5a897a10cba564bf609839baeaf651a2f83c2de4a492e79b9e2291eff5d1b7928d95198d7c74daa2aa9e6675f54e40f59df5e4139118ae6152d4281616228"

RPROVIDES:${PN} += "application() \
application(org.inkscape.Inkscape.desktop) \
inkscape \
inkscape(aarch-64) \
libinkscape_base.so()(64bit) \
metainfo() \
metainfo(org.inkscape.Inkscape.appdata.xml) \
mimehandler(application/illustrator) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/visio) \
mimehandler(application/visio.drawing) \
mimehandler(application/vnd.corel-draw) \
mimehandler(application/vnd.visio) \
mimehandler(application/vsd) \
mimehandler(application/x-visio) \
mimehandler(application/x-vsd) \
mimehandler(application/x-xccx) \
mimehandler(application/x-xcdt) \
mimehandler(application/x-xcgm) \
mimehandler(application/x-xcmx) \
mimehandler(application/x-xsk1) \
mimehandler(image/cgm) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/x-eps) \
mimehandler(image/x-vsd) \
mimehandler(image/x-wmf) \
mimehandler(image/x-xcdr)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
lib2geom.so.1.2.0()(64bit) \
libGraphicsMagick++-Q16.so.12()(64bit) \
libX11.so.6()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libcdr-0.1.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgc.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler-glib.so.8()(64bit) \
libpoppler.so.128()(64bit) \
libpotrace.so.0()(64bit) \
libreadline.so.8()(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvisio-0.1.so.1()(64bit) \
libwpg-0.3.so.3()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libz.so.1()(64bit) \
python(abi) \
python3-gobject"

inherit rpm
