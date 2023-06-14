SUMMARY = "PDF Rendering Library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler128-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "843394d98cb9c4fa63c96714193fe539f2a044c4b5cabcde7f5d6dbf4493f12aed5dc3227b72a7efdc1f09159a2031a4ca4b08cd5a58625b3cd821baf5d17292"

RPROVIDES:${PN} += "libpoppler.so.128 \
libpoppler128"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libopenjp2.so.7 \
libplc4.so \
libpng16.so.16 \
libsmime3.so \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
