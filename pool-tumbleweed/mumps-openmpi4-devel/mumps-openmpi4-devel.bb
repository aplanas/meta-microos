SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "4d0a2dd14cd8f57fd8f874878ca47badf3c1c8cf4cc9b18b585767dbe950cb33f177e3f9e5b896d98f2b8b0e1127335799a6343da7aa0a8e8646500ef510a096"

RPROVIDES:${PN} += "mumps-openmpi4-devel"

RDEPENDS:${PN} += "libmumps5-3-5-openmpi4 \
mumps-devel \
openmpi4-devel \
scalapack-openmpi4-devel"

inherit rpm
