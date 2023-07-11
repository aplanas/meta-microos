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

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "94a89434f0d62f7b2fddd8ecc1c624b2e08bbdb5e26fa9c60336b2046c5609bb271a9be00e58c0dcaf3dbe57041dc81a55c3ec7843831b272e54327ff95e2b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
