SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-mvapich2-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "160a3e53c6378b75de2e6f7e1312166e132f37390718835e62fa2770e06c8703c5774d103527585357ec8a08fc992c36ef53baaa62bcba857969fb2a30bd731e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
