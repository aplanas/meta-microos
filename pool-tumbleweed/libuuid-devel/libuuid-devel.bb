SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid-devel-2.39-2.1.aarch64.rpm"
RPM_HASH = "8a274ac5a21d1480819760819f1445d5c8a91d4aa2fee8cedb93fac211fe2d02024cb5f83551358d79c425860ca39c2bda66e098ffdd51141296b4bf278eb74d"

RPROVIDES:${PN} += "libuuid-devel \
pkgconfig-uuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid1"

inherit rpm
