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

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi4-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "e3e5c011685126be3a53cfd011ca14cd4da4eb7b0b1e9251d77c21b17e11b8b3d47dd378d084cfce64fec5aae772ae304d739fe1a956a5fe68be27140009718f"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi4-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
