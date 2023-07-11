SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi3-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "68906ea061671bc37e3c416f26714a5c0d452f0d1d9e33a6aa3563e51bdd8fc46c390e4d7098a45aaf78ffd37ab7c0a27f66d358092aa7bdaf23a4ab85761496"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi3-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi3-devel"

inherit rpm
