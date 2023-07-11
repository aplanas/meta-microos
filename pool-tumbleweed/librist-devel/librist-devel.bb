SUMMARY = "Development files for librist"
DESCRIPTION = "The librist-devel package contains libraries and header files for \
developing applications that use librist."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "librist-devel-0.2.7-2.4.aarch64.rpm"
RPM_HASH = "cda0798cb15db65b97d7036dfef817b35bd9ad6ccfc79aff64cc138a806ba1465534d3e9c69fa4f5fc9be15c21f95baad0fb66b68ccb592856eeb5d917bd1e08"

RPROVIDES:${PN} += "librist-devel \
pkgconfig-librist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librist4"

inherit rpm
