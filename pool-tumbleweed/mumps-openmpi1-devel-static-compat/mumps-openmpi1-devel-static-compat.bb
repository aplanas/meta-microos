SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi1-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "cc43d911837cfa345d9838dbf114aa02e8081812528df2858e2cc233289f9d64b18f41369c0511b715f3af49dd82cfe6c608fbd6ea7cb4c56b8ea5aad91f6508"

RPROVIDES:${PN} += "mumps-openmpi1-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
