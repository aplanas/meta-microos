SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-devel-static-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "e1329adb4634ee78005f02af545c3f02cc8da6c937a9ca762082d6f3d6c6052eb6fde1378fd9a16bcfc45812475b530d21273535aea37397dd4297c4ef08c9ec"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi3-hpc-devel-static \
mumps_5_3_5-gnu-openmpi3-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "mumps_5_3_5-gnu-openmpi3-hpc-devel"

inherit rpm
