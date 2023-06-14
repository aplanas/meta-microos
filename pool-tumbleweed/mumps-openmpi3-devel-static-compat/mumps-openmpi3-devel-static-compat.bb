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

RPM_NAME = "mumps-openmpi3-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "99c9c05f47cdba83e2895f11047052d89e9262fb6a8879c8c9b817119ea0773cce2ac10d29713c4330cfbc292ed59dfdb07f1887d18b44a5e7d8281620c8ba07"

RPROVIDES:${PN} += "mumps-openmpi3-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
