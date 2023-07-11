SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi2-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "6bab30d552dd3ea0471500e84906f58d85842ef6f7317c352d31c4c563bd01bb7177a7c3ce856e40870b6be9c4de6736f7933c454db8e15ad4c515d8918ba94e"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi2-devel-static-compat"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
