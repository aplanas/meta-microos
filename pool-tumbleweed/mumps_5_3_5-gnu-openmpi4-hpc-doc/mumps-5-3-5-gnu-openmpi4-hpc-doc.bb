SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-openmpi4-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-doc-5.3.5-3.2.noarch.rpm"
RPM_HASH = "13987e42b574c91cf635893ea23c56c2723118b79107ea580fa74c0444463fdae93c58b7a453063cd10d64294452959db3706cf1fe2ef1822397fe55b6589df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
