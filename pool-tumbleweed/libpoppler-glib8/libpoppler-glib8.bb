SUMMARY = "Glib wrapper for the poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-glib8-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "875ba357e1c69ed3c2426e9e80962353267b7e3b5e175f09e68e52772b2e2ee45b225b4545b41a3499386741b47d5fcb30da439e59e3918ed97154b23d66fa90"

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
libpoppler.so.130 \
libpoppler130 \
libstdc++.so.6"

inherit rpm
