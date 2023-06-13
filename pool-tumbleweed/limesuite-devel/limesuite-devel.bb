SUMMARY = "Development files for libLimeSuite"
DESCRIPTION = "Libraries and header files for developing applications that want to make \
use of libLimeSuite."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-devel-22.09.1-2.2.aarch64.rpm"
RPM_HASH = "f836a52d2d1cbc0949ffd6e71e640ff3b77fd779d3e8593567d4c1ec0b427b5833ec3b54475d63f71457d072b398ad278a9ed907aeaf5e31eea089b6128d09a8"

RPROVIDES:${PN} += "cmake(LimeSuite) \
limesuite-devel \
limesuite-devel(aarch-64) \
pkgconfig(LimeSuite)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libLimeSuite22_09-1"

inherit rpm
