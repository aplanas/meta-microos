SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi3-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "b8395c0202cf60fb8a8b62e772ff5688c648ee68ce5a1d08c288696de88ae05368d752ac727f3cd1631d7f89cfb9b96f2605b38793abbc744b472a182d411e53"

RPROVIDES:${PN} += "ptscotch-openmpi3-devel \
ptscotch-openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi3 \
openmpi3-devel \
scotch-devel"

inherit rpm
