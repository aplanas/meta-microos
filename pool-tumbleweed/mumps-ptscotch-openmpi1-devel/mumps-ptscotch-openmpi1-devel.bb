SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi1-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "d8e6d327d16a0a696e24a21f2d90cb8cb1f42265a3a9a9083847cca65d66b3fadb79601c6bd5c7581993ae31493126b0a6a207780da0a4598e39ad3e013a4737"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi1-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi1 \
mumps-devel \
mumps-scotch-devel \
openmpi1-devel \
ptscotch-openmpi1-devel \
scalapack-openmpi1-devel"

inherit rpm
