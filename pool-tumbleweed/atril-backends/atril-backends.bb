SUMMARY = "Atril shared libraries (View and Document)"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-backends-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "305fb8d4007834d0844808c7291e8adc84b21ff3e1d4b1793da02712444cc8fb3556e581bb68332b9e4b1aebb65f09bcb356a16e9edc251cdf26bf6ae3849063"

RPROVIDES:${PN} += "atril-backends \
libcomicsdocument.so \
libdjvudocument.so \
libdvidocument.so \
libepubdocument.so \
libpdfdocument.so \
libpsdocument.so \
libtiffdocument.so \
libxpsdocument.so \
mate-document-viewer-libs-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatrildocument.so.3 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgxps.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libspectre.so.1 \
libtiff.so.6 \
libxml2.so.2 \
libz.so.1 \
mathjax"

inherit rpm
