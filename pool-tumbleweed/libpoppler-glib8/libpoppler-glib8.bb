SUMMARY = "Glib wrapper for the poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-glib8-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "33d39ec1fcc53c3d57bf9d723560a08ca9824305f98b4cc4fcde2270dc3f49766170408d7e778ea1b991d7a46f1fe1922a36ef25390eef76d5c3db975619fd39"

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
libpoppler.so.128 \
libpoppler128 \
libstdc++.so.6"

inherit rpm
