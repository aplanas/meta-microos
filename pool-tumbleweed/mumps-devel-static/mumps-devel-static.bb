SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "45b499e4da332545634e53fdb37caa92934de66b4df29dd164d3b5a277aacd768cf6d978f0b65ef70933998750f60ec540af2d1d64e3aa86ea081feee55995d5"

RPROVIDES:${PN} += "mumps-devel-static"

RDEPENDS:${PN} += "mumps-devel"

inherit rpm
