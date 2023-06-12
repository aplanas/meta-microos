SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi3-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "40940bda8f344fe3eb13e6533fbd7e6fd0ecfe9a24e5b06ab456ac8578d32398e8fb1c013ecdd590a2994f410da6968e419be5b1e53aa99d464bf296dd20ffa3"

RPROVIDES:${PN} += "libmumps-ptscotch5_3_5-openmpi3-compat \
libmumps-ptscotch5_3_5-openmpi3-compat(aarch-64)"
RDEPENDS:${PN} += "libmumps-scotch5_3_5"

inherit rpm
