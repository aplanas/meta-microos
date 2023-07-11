SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "07a392417f3ff097b92b65d9192016c30d2c81c4afb0f566d417dc15df968c5870c1cca3573770e6310515baa5006a0bb7e82a4e8d08c67725bfcbfde66d942a"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-devel"

inherit rpm
