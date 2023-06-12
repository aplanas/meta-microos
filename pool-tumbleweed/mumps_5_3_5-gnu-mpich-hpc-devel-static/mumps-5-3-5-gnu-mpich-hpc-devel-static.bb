SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "d6fa2fecd4ae04615640432fd909e2b0e1211bf6044d872d900e3fb3d28cfdd2331303af6159ed3ed3f68a2a4d873957a4fb4620afd39795e2af57e6f982c391"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-mpich-hpc-devel-static \
mumps_5_3_5-gnu-mpich-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps_5_3_5-gnu-mpich-hpc-devel"

inherit rpm
