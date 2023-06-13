SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "50f8f219ea8caf6f2d3569de218d2d18a0ece708a6322566ff039da3506cf04a6704aca2f52adac8694ef32a6da0a345833ad4a957348bef869229b21267a940"

RPROVIDES:${PN} += "mumps-mvapich2-devel-static-compat \
mumps-mvapich2-devel-static-compat(aarch-64)"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
