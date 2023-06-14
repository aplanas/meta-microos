SUMMARY = "Development files for librpma"
DESCRIPTION = "Development files for librpma"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "rpma-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "031e827b7e0728325422f4b2368179e2d4b56ef6c48bd199e54fcbdd84ccf5d2b0c334c6bf624348711ac8b67c73684044f69197334e53f2efd475b083fcc744"

RPROVIDES:${PN} += "cmake-librpma \
pkgconfig-librpma \
rpma-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librpma0"

inherit rpm
