SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi4-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "d83fb8643d7a61b52154cebeaccdba669a79302058571cf5d78030560a1dd1111a5a43760c4bd3b2c260929583889d84b62330565031e45cd3787879aaf0fbf4"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi4-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
