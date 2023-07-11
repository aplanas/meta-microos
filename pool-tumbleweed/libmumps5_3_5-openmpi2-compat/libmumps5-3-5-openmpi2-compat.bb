SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi2-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "02037716be756aeb00acd82a4218cabfe5665bf7a07780dc3305d755f8ce612254d1db5ec621b3ef86eba00468ba39295711ad22ad13ad8d42f467b6e9f48566"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi2-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
