SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi4-hpc-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "0994d7a0bc2dc9cc86d19373bb34e6b5d2a5d367ee921fa319e8d7937a1657c263c8f931db0e6a7031d7a01c32152fd7d57357e16fc29c957bd043a90d6b373f"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-openmpi4-hpc-devel"

inherit rpm
