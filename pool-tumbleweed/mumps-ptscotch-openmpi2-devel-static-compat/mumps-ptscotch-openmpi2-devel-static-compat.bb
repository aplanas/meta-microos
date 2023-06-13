SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi2-devel-static-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "8de6fba231303a17feb23fbe2e315e2e3665039d638626f9ffe1516ddb71f1d3ee2b4b3e6affc2a0ea24826e7cc6061617eb58cf85307aa5ee10e391d9c067f7"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi2-devel-static-compat \
mumps-ptscotch-openmpi2-devel-static-compat(aarch-64)"

RDEPENDS:${PN} += "mumps-scotch-devel-static"

inherit rpm
