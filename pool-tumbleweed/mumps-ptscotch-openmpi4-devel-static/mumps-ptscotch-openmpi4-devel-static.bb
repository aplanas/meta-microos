SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "65b9ab13145a8739fbc9a00f57705f8090b263c740e8745d5ac0ee67e9a6010fab1c6dcf7d488180c6626333e7e4b20a350a56e142c4b542e5fd7e8415bce413"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi4-devel"

inherit rpm
