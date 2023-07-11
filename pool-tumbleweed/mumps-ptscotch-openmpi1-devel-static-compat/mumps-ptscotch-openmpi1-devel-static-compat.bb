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

RPM_NAME = "mumps-ptscotch-openmpi1-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "b28eb59f75a73a288c6d2461c97e9869fa7dd2aa7070be8555878a0b6468b33b54b05556b3c82fd5950f7f1de4a325632d5b3c5e9deeff8b8b8136f8aa7a0fcb"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi1-devel-static-compat"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
