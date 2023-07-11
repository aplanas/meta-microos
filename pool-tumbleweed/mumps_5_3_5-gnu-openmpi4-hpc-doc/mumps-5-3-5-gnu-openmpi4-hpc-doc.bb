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

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "52ee603b314e7654cf273658b414eb7d63da5c45750ef99fe7b778cca6ec3198287679b34eb9e5c1c08a7e204d1b6d9d7bea809095b9a670baf08942df876923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
