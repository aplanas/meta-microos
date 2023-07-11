SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi3-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "09383017a9758641a7b5b870e34795cae12b9bb30a806b3fa05debf91ac19f4a1c8eaedda4a2f88489d6f5e9b827979802bc0c3db208748199ce48aa36d563df"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi3-devel-static-compat"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
