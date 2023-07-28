SUMMARY = "Development files for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-devel-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "85f95ec33dc9759dabe69794e8aa485e043b02ca3b52563c4ae626cbb90843b10209205806efb5a03a4eb134ea93a816fcebe9af6b25849f5ded79f289c4238b"

RPROVIDES:${PN} += "libpoppler-devel \
pkgconfig-poppler \
pkgconfig-poppler-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpoppler-cpp0 \
libpoppler130 \
libstdc++-devel"

inherit rpm
