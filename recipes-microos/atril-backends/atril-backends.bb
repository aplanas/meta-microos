SUMMARY = "Atril shared libraries (View and Document)"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "atril-backends-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "9d5513fa629d87c39f3338e5cd7f302f2ef0d677b47d47053faced1f69fea1770a65f48f5e9580abd231f5aebc5848f43bf68abf64bf4fb76f9179fb7f5763af"

RPROVIDES:${PN} += "atril-backends atril-backends(aarch-64) libcomicsdocument.so()(64bit) libdjvudocument.so()(64bit) libdvidocument.so()(64bit) libepubdocument.so()(64bit) libpdfdocument.so()(64bit) libpsdocument.so()(64bit) libtiffdocument.so()(64bit) libxpsdocument.so()(64bit) mate-document-viewer-libs-3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatrildocument.so.3()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libdjvulibre.so.21()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgxps.so.2()(64bit) libkpathsea.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpoppler-glib.so.8()(64bit) libspectre.so.1()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit) mathjax"

inherit rpm
