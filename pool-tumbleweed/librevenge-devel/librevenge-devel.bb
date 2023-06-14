SUMMARY = "Development files for librevenge"
DESCRIPTION = "The librevenge-devel package contains libraries and header files for \
developing applications that use librevenge."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-devel-0.0.5-1.3.aarch64.rpm"
RPM_HASH = "1fe14a468334f41e4ed716e01ba32e9df48278bfd26c58ca8f440586d0af2075e016c2076228303a6be393845a2d594664c2b41415f12a1cfb57a531b54cb5d1"

RPROVIDES:${PN} += "librevenge-devel \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-generators-0.0 \
pkgconfig-librevenge-stream-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librevenge-0-0-0 \
librevenge-generators-0-0-0 \
librevenge-stream-0-0-0 \
pkgconfig-librevenge-0.0"

inherit rpm
