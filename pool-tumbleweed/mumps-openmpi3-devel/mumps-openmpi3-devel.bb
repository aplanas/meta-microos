SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi3-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "d5c6e476147d83333577dcdf63770d617aa9286efc6818415081094076362d44f50f8aec322d9f400e690ee34438fbfa5f0b2f0b565a402248a47a3e3c824a47"

RPROVIDES:${PN} += "mumps-openmpi3-devel"

RDEPENDS:${PN} += "libmumps5-3-5-openmpi3 \
mumps-devel \
openmpi3-devel \
scalapack-openmpi3-devel"

inherit rpm
