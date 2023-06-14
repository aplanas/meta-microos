SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi2-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "634cefb2d1c89a56fd59bee42dd2639c4f6ec18da2cd463151af356aa4f69e05b29020c9db7ea6a0d53804a3eddfde3d2716b5d6ccc4b6ce55371dc737ea1fa1"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi2-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi2-devel"

inherit rpm
