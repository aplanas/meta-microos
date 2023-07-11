SUMMARY = "PDF Rendering Library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler129-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "5106c0d2abc4a78ae5eac0382508648c35e95a6f3d86e9c82d01de39987ac248275329fd8d59b32d04c343fc85f9c54cba3190fc800e22ef236f203c268f8f56"

RPROVIDES:${PN} += "libpoppler.so.129 \
libpoppler129"

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
