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

RPM_NAME = "mumps-openmpi2-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "18f789b15213ccfdf2e8f7e612631b2025afb06851fa8d528569e1d7093de50a510bf3bac757953175ae89f9dab55bbe974bfa05a2267938d306dd930005767c"

RPROVIDES:${PN} += "mumps-openmpi2-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
