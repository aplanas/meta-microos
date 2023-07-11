SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi1-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "0863385be8eaa07424b866fefb1eacddd2b17ca3d18e0b02b2d986011f37668d5ebe0b5a9dea0331c008c6b70daecd25d03dd4ce7c6181e66d492c3eda350e74"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi1-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi1-devel"

inherit rpm
