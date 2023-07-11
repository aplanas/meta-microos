SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi3-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "ffe52c9900558d39123eca29edc1e5d04dfa40aa9609c51679645e1be068dcbb99fc0dd1146e9a275185c3c2941c7f8480ffaf91599ef15d8c24338b21c8db98"

RPROVIDES:${PN} += "mumps-openmpi3-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
