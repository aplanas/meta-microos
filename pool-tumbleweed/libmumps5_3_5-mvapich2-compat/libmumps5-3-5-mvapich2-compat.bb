SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-mvapich2-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "f3f6e975078161213d54c73e9b87a8be1c81c1406832a6292bfec23bd79d0e1b0b209cbf86eaa7206eacc0fb33b5853a0aa59bbfbf9e29ce3e903dcf2e30f7f2"

RPROVIDES:${PN} += "libmumps5-3-5-mvapich2-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
