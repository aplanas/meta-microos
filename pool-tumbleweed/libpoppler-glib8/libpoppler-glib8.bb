SUMMARY = "Glib wrapper for the poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-glib8-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "33d39ec1fcc53c3d57bf9d723560a08ca9824305f98b4cc4fcde2270dc3f49766170408d7e778ea1b991d7a46f1fe1922a36ef25390eef76d5c3db975619fd39"

RPROVIDES:${PN} += "libpoppler-glib.so.8()(64bit) \
libpoppler-glib8 \
libpoppler-glib8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpoppler.so.128()(64bit) \
libpoppler128 \
libstdc++.so.6()(64bit)"

inherit rpm
