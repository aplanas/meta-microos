SUMMARY = "C++ API of the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-cpp0-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "09b1a7da519384e8544d5fda2cf20902ddb1742fd7acac058b8f3b2b7e4513c465a4e83422472e5872b8e9807cd530171027c0e7b760122e407749d4fa0e8313"

RPROVIDES:${PN} += "libpoppler-cpp.so.0 \
libpoppler-cpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpoppler.so.130 \
libstdc++.so.6"

inherit rpm
