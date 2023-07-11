SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-ptscotch-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi4-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "7324535ee27fed99969ffef7632e579700b79ce436b724b2849ac26b78984057af1c020300de299ea6096d71291d96407d89a9856d4146ae626a71cf80aaa1d2"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi4-devel"

RDEPENDS:${PN} += "libmumps-ptscotch5-3-5-openmpi4 \
mumps-devel \
mumps-scotch-devel \
openmpi4-devel \
ptscotch-openmpi4-devel \
scalapack-openmpi4-devel"

inherit rpm
