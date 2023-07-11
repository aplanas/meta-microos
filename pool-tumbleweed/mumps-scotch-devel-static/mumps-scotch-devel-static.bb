SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-scotch."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-scotch-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "3437652d018e3607de5bc903db67fef44bfd1c8b556e064c33b03f24d70075a067c973210dd9172b9a4dad25e6bf31fb8b57c0d2091973c0045b5411e3835d04"

RPROVIDES:${PN} += "mumps-scotch-devel-static"

RDEPENDS:${PN} += "mumps-scotch-devel"

inherit rpm
