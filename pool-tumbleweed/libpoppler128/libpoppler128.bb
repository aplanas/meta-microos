SUMMARY = "PDF Rendering Library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler128-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "843394d98cb9c4fa63c96714193fe539f2a044c4b5cabcde7f5d6dbf4493f12aed5dc3227b72a7efdc1f09159a2031a4ca4b08cd5a58625b3cd821baf5d17292"

RPROVIDES:${PN} += "libpoppler.so.128()(64bit) \
libpoppler128 \
libpoppler128(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libopenjp2.so.7()(64bit) \
libplc4.so()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsmime3.so()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
