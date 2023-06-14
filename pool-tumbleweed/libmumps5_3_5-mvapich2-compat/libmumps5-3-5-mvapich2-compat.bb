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

RPM_NAME = "libmumps5_3_5-mvapich2-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "e1bbc5738941f8dd0dfa755411dadb85f6072ea42c57a0eb40744ec4f8b58aace5bb7851d5d6e76a65e600a0eb8521916bedea50a7515f49462309f48ce68715"

RPROVIDES:${PN} += "libmumps5-3-5-mvapich2-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
