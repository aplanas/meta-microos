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

RPM_NAME = "libmumps5_3_5-openmpi3-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "23f2875b8e0765fc2d37dd8266fcdf0caae9d87c6425999e2fa57f77f701626bd1c5206dd9ae58a841f89d34a2be8cd51e836c752ca4d21aefce7750ca2b2aa3"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi3-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
