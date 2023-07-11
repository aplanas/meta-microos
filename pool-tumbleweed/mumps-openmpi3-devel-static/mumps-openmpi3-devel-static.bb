SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi3-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "038dff453f542b9760b8ee2203474bd7ced1d8f0cbd2128e748333b01af37ba50c7851ff565a9bec015b9aae32ba6f53909d1ba558151a70f869c55a4bb53e51"

RPROVIDES:${PN} += "mumps-openmpi3-devel-static"

RDEPENDS:${PN} += "mumps-openmpi3-devel"

inherit rpm
