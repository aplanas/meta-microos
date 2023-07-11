SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "cc3ec092d947092c7f06a22f6417565f5558a4a76d0af0d15b2742ce4878eacb25f720df2d8fa8664e33ba334d14928b9ad6be7cc1dea85b9bd6eee2b7b36220"

RPROVIDES:${PN} += "mumps-openmpi4-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
