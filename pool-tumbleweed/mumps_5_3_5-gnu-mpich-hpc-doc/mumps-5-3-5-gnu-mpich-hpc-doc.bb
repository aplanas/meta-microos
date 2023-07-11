SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-mpich-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "4fb48cdff3e871fa8e34c5d73d153dcae8a08b040ab9c706656f86c5683bde0afeb176452ebc88d369d58478ed8576942b42c5492c6bbec8d5dbe24cc4c5ff10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
