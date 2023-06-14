SUMMARY = "C++ API of the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-cpp0-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "25af16f5992144fb3524604bde713daf58608b073f7291a45d28b69e10f38c0c06c226c0d7f17690877fccac5b1d36929fc2529536752ec1cd0ccb2b398cce44"

RPROVIDES:${PN} += "libpoppler-cpp.so.0 \
libpoppler-cpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpoppler.so.128 \
libstdc++.so.6"

inherit rpm
