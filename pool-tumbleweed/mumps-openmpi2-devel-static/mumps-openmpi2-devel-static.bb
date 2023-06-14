SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi2-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "aa47a930cf2064ad708d44103bc286e22ba361c0f4232f83abc68c0f5021c7fe44b21919577c2a04aeae2b04faf6273cd81578daf02b19efcb79e497e3cb38fb"

RPROVIDES:${PN} += "mumps-openmpi2-devel-static"

RDEPENDS:${PN} += "mumps-openmpi2-devel"

inherit rpm
