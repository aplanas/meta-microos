SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-openmpi1-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "21a13344fdd38db2d5db009edd8894dbc9b199ea62b7c2600316cae0aafdf8b0d748a056aaddd2b85521eee5d6076d50512ca3d02a83cc2c921aaf62b282407b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
