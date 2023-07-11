SUMMARY = "Glib wrapper for the poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-glib8-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "93b86defef10ce5511682d0b3b7eedb843ba59c16497bead333562db813c21468bd0c4397b19dd1770006b2d5af33cbb52d7d4f75cb108a2368ff071704a65cb"

RPROVIDES:${PN} += "libpoppler-glib.so.8 \
libpoppler-glib8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpoppler.so.129 \
libpoppler129 \
libstdc++.so.6"

inherit rpm
