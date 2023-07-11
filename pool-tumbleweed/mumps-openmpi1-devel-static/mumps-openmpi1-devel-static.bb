SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi1-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "b6d0d6b9bae96efa10d2cc95c26c30f2a58acd88e4be6e418fb53807bee7fa8d3dfb9fb18fda6ded73a0962d4fd14650f30fd41a4e8aacf18d8788764e34d0ec"

RPROVIDES:${PN} += "mumps-openmpi1-devel-static"

RDEPENDS:${PN} += "mumps-openmpi1-devel"

inherit rpm
