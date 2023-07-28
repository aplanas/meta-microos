SUMMARY = "PDF Rendering Library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler130-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "df004a166c188011d631f5f22d9268ce0c96d41ab01965a1ae0b80c2408c291b537ee0cdafda13d9293de27fedd6d29d2a4c6914afc1c5eb5f67bb5be79abf03"

RPROVIDES:${PN} += "libpoppler.so.130 \
libpoppler130"

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
