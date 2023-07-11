SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi2-hpc-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e7fa0e5154c563a844ba203691673c1b1075d19e48c660f8f884e8ae2b1c638b4675a4cc77f7acfa610c1c5f148c48d15f779861d6d47dd981d0ab8ad4a821cc"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-openmpi2-hpc-devel"

inherit rpm
