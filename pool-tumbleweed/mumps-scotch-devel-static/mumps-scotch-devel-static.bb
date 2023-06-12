SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-scotch."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-scotch-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "02e8bd2f0b3b68713c49df8d35143b62e339d10eb4d353ae44566018270346cf2c79af04b3ce52e14464b8f1bdbd725fdb8e665cfa95dea8309b6457b989ae9d"

RPROVIDES:${PN} += "mumps-scotch-devel-static \
mumps-scotch-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps-scotch-devel"

inherit rpm
