SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi3-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "7f696cf695ec330d530d96bf214458aeda848eb2c22b6203e7808245f5a77a4eda40926aa0bf2ffe359b27f3c620a1a3fdc62cf90c5bf3b27bde2d6378c75491"

RPROVIDES:${PN} += "mumps-openmpi3-devel-static"

RDEPENDS:${PN} += "mumps-openmpi3-devel"

inherit rpm
