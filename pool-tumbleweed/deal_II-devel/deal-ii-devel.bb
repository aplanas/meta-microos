SUMMARY = "Development files for dealii"
DESCRIPTION = "The dealii-devel package contains libraries and header files for \
developing applications that use dealii."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-devel-9.4.2-1.5.aarch64.rpm"
RPM_HASH = "192e2369d3b23361d52e30183612a90e83d7f78ac27856360e014cbde53e18c4e73d1ba5847c2515de714adf990a69456f79495e2d4fd090d8082b79a53c274a"

RPROVIDES:${PN} += "cmake-deal.II \
cmake-deal.IIFeature \
deal-II-devel \
dealii-devel \
pkgconfig-deal.II-release"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdeal-II9-4-2"

inherit rpm
