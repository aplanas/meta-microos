SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "04ebb5f028e9a060c4449118b945db2eb4ea9fd061edec8ad77494c53013b64e1d193a5ee07f8a13ad22fed431e921f76d7ac06b18057033bd64746f7c02dad6"

RPROVIDES:${PN} += "mumps-devel-static \
mumps-devel-static(aarch-64)"

RDEPENDS:${PN} += "mumps-devel"

inherit rpm
