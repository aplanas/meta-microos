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

RPM_NAME = "libmumps5_3_5-openmpi4-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "0bf59eae719c67965b3d6d41d5317a28cdedeb423f0aa634d7222eef0ccda6949ef408fe7fffde35cc0e9f6eaf1f0a88c9159c686a3086bbb7e324cbd3cc673b"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi4-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
