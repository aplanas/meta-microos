SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi2-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "b49cfc11b11029bdea27d570e14e14c653f87071b4d5253fc51caf429ab09dd895b4b10811534aaa7abce421c222947452f87cd85c7cdb95665baae2c5d7e6d7"

RPROVIDES:${PN} += "mumps-openmpi2-devel"

RDEPENDS:${PN} += "libmumps5-3-5-openmpi2 \
mumps-devel \
openmpi2-devel \
scalapack-openmpi2-devel"

inherit rpm
