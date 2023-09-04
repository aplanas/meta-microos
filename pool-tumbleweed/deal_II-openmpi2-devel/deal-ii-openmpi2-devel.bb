SUMMARY = "Development files for dealii-openmpi2"
DESCRIPTION = "The dealii-openmpi2-devel package contains libraries and header files for \
developing applications that use dealii-openmpi2."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "deal_II-openmpi2-devel-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "4569bbd89bf5604891b3dc6a82d75bd55907900d55964a2d51c225bfdc27ce66abb48a1fa4089b8f3a91a67d387c9fc5436e1802dd3c1615f6c5691f0a3eb709"

RPROVIDES:${PN} += "deal-II-openmpi2-devel \
dealii-openmpi2-openmpi2-devel"

RDEPENDS:${PN} += "libdeal-II9-5-1-openmpi2"

inherit rpm
