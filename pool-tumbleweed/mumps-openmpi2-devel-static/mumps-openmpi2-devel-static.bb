SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi2-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "b67cc6330832ef58f6eac542cd06ca82c8ff6d03df5e22e6b7cd5863645d209b823b8363f2a8a0a5da833931fe3a0778cf2952da400c644a1b79a47b689a683c"

RPROVIDES:${PN} += "mumps-openmpi2-devel-static"

RDEPENDS:${PN} += "mumps-openmpi2-devel"

inherit rpm
