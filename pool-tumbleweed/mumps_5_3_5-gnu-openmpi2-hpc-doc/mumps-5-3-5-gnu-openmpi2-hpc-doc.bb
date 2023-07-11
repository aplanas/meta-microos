SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-openmpi2-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "da16f3d0ffe5112d0e4f9389b8ee1b7d1b366bf6cfbc144873e80206009085a2539680d51cafbefb1ccfcd63278081b2db49e1da9e85d727f3a85f2aa84faa3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
