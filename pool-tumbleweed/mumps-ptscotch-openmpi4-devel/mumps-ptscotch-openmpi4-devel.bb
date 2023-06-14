SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "2df1443b7d3c4c8c4cb39bfcc2a3c2ad8b42b3e2b70c19f87b0106488305d413db584a7954884adcba56362159a7bfca96024b965338c1786c4524f3dbbacd33"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi4 \
mumps-devel \
mumps-scotch-devel \
openmpi4-devel \
ptscotch-openmpi4-devel \
scalapack-openmpi4-devel"

inherit rpm
