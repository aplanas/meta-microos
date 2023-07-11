SUMMARY = "Library for the JPEG2000 codec for RDP"
DESCRIPTION = "This package contains libraries for the JPEG2000 codec for RDP."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "librfxencode0-0.9.20-8.1.aarch64.rpm"
RPM_HASH = "5850100a5a34d58c93e8aa27db18e7afab4c164699551b77a1c425feb1d317a7cd59cfe97b26cbfd838b4801df5bbe18a1f6f463e31f51da4db34b9c82c203ec"

RPROVIDES:${PN} += "librfxencode.so.0 \
librfxencode0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
