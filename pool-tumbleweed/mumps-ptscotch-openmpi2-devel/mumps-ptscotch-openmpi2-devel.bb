SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi2-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "2a1b9fbc058c11cb0a8428eaff5fa8d45dc3e789b0c7888f4ce9fb26d652bd93327417f3675cf2546387a4f93ace87fd2e2d98956d1577efc19a1d884cfc887a"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi2-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi2 \
mumps-devel \
mumps-scotch-devel \
openmpi2-devel \
ptscotch-openmpi2-devel \
scalapack-openmpi2-devel"

inherit rpm
