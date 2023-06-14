SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "27e8e3b00c777cd127735233db12e1ae766cf6dd3d5a486031d37b71e45e68285eb759fcd45a85481ecc8640006274ed414b5400a3dbd95402c6b1e5ad8396b0"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-devel"

inherit rpm
