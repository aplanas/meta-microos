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

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi2-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "fbcf849063093a4239f62171669f94b4f3a4a8f30450461f383c22c6f4542e622285709ab2a54b2cd53284e47ebf452583d4a5131cd569fda4e8d157e827a137"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi2-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
