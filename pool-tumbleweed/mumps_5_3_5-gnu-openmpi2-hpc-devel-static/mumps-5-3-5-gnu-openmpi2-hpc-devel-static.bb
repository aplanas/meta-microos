SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "30add7c113fe955ab8a884f3929187a7dda018f7eb34c2380a8ace7cfb9bc4a68f7622727543427f09c06075748191bc46da72f25216085afaabab097ce8a1d4"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi2-hpc-devel-static \
mumps_5_3_5-gnu-openmpi2-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "mumps_5_3_5-gnu-openmpi2-hpc-devel"

inherit rpm
