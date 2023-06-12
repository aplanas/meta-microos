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

RPM_NAME = "mumps-ptscotch-openmpi3-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "de84b835a96d53bc64d279f957d48c2f37b8d059f64597287b59ff67c7f10dea1cdd11442a6cc2c5739f4607401eb01f4d77ca8bb6c9f8b2d5427973412f7ebc"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi3-devel-static-compat \
mumps-ptscotch-openmpi3-devel-static-compat(aarch-64)"
RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
