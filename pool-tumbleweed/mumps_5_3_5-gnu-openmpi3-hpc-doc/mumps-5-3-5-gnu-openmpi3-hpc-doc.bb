SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-openmpi3-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-doc-5.3.5-3.2.noarch.rpm"
RPM_HASH = "3fd643ae2852fe830a708f636c57656a0f1750646fd1fb0329e36bf8d5b60eaad1c82aaaa47ac6e39b1582fd82f3e4e4cbb26caa840f99d693d4009b3af37910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
