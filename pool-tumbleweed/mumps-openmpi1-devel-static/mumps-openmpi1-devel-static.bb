SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi1-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "91be4c67a78a238579e56b7a4bd7d35adaa098d20b0a64ec0d7c521642111e28ddae2cadc5696dca8ca3648523a612613fd43605cd3e241685e4e821cbb3f114"

RPROVIDES:${PN} += "mumps-openmpi1-devel-static \
mumps-openmpi1-devel-static(aarch-64)"

RDEPENDS:${PN} += "mumps-openmpi1-devel"

inherit rpm
