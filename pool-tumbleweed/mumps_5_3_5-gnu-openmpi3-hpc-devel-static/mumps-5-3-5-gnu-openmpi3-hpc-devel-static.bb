SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "5a8b6b35d6f7214be16acae7549cb34f84df83cb4c632824bb54e54cd798127d4f952ca50904074bddb8e584734347be3c42b38b73d464fb85421e97994103f0"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-devel"

inherit rpm
