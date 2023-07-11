SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi3-hpc-devel-static-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "f3f74231d5f4b83e421d21439efb22b497d2e7ecb97ce47042b5237159701e9aa0eea3b83c8015a0fb11f06b15bb4cf9be07e7e21348b075a51559e1197c70f1"

RPROVIDES:${PN} += "ptscotch-6-1-0-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "ptscotch-6-1-0-gnu-openmpi3-hpc-devel"

inherit rpm
