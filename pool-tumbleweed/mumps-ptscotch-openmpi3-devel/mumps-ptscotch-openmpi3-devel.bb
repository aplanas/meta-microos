SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi3-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "e65b6c9b776c862327eebcc0ea3b5f276541af42df23c4353feae5b86b8ee60bad8ff8b54eac4ec90175d942d3029e7cdfdfca10babfe7b7e9cea662404ec994"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi3-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi3 \
mumps-devel \
mumps-scotch-devel \
openmpi3-devel \
ptscotch-openmpi3-devel \
scalapack-openmpi3-devel"

inherit rpm
