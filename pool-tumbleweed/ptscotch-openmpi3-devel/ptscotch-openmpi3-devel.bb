SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi3-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "3eb8a99bac21e06eeb7625aba189bdd10bbe99128c7925d8f777f50cdefe455885be8832a7346b3cf5a3aabdbb8129def19b490fbef95eae5f31794eb8669398"

RPROVIDES:${PN} += "ptscotch-openmpi3-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi3 \
openmpi3-devel \
scotch-devel"

inherit rpm
