SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "77ee799ef25ae30a0361affb8c88949bcefe5a1d8907d0b0dfb3302b37e8fb10887e20830151cd9bd5ce97b828926532bb6866c85b3511cf4f1e6b0c0893d58a"

RPROVIDES:${PN} += "scotch-devel \
scotch-devel(aarch-64)"

RDEPENDS:${PN} += "gcc-fortran \
libscotch0"

inherit rpm
