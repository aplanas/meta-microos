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

RPM_NAME = "libmumps5_3_5-openmpi2-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "e37075b21b1508ed4079d2324931cf8a9a5571972502066be71b1a35393c0491c13413610e1236b15d3150667e9624e5b36235de183bcb5083f275a778eccfb8"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi2-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
