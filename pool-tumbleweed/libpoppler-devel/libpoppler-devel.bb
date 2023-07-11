SUMMARY = "Development files for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-devel-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "0ebad259f0c21c92162c3bedfa28b37516b5ebaf0291c5666f25a042ae3385fbf0fc25d1c52cf16909916d2cba0a92766f2cb3e5213a406ff3eee162b59e759f"

RPROVIDES:${PN} += "libpoppler-devel \
pkgconfig-poppler \
pkgconfig-poppler-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpoppler-cpp0 \
libpoppler129 \
libstdc++-devel"

inherit rpm
