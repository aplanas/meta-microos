SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid-devel-2.39-1.1.aarch64.rpm"
RPM_HASH = "5267c6d95b5dd759f078f161c4aa228f37a9bda40ba7ef7213d9c455c23d5952fdd7295e06f452eeb35be48941186719bc21a15ae61e2027fac42a548158a87c"

RPROVIDES:${PN} += "libuuid-devel \
pkgconfig-uuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid1"

inherit rpm
