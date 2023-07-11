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

RPM_NAME = "mumps-ptscotch-openmpi4-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "6cc6258ac3cb5c1beec9edc03cff5f4435e21da7d5c828cb7a98093a5452998ced7accc7750b6d37e527d17af91b24d15e969ff89c4d269c0089a174aade62c6"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel-static-compat"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
