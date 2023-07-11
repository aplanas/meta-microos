SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi1-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "6afa52b7dde97a4bfa7eed269507e4f837db0c4c5597793eab123ca81030074e973e280dd1f16af163142a1f9c274331d8b36753129892a9a9f51b598f2176d1"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi1-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
