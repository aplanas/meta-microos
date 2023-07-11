SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi2-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "2d1f43cd2c1403c5865e0fb7ca5212de00bceda329e1fcf4c85252c2d40cedef1ade19581f4a0a4d7c3f4f5531a05235b56751b2f85cd8945f37ada9cd08dc33"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi2-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi2-devel"

inherit rpm
