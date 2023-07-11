SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-scotch."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-scotch-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "de17717d50ec7096f3aff309d47f74bb5629f6ac398bc8ecb6acd8dc938010b832be78496e2c09cf4763ccc71dfa35ed39facad8486eb41d76517106c708c5be"

RPROVIDES:${PN} += "mumps-scotch-devel"

RDEPENDS:${PN} += "blas-devel \
lapack-devel \
libmumps-scotch5-3-5 \
mumps-devel \
scotch-devel"

inherit rpm
