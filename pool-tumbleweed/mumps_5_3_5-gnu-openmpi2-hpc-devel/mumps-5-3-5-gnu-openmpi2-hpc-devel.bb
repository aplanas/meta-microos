SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "6d94e75b1c937762b352478f006de2304622d8270c62d7e34cc1017b4ced9e50f0c5f27f19a6804394a36e65a9f3903ee3a8796c29791264d024cd7aab74ebf6"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi2-hpc \
libscalapack2-gnu-openmpi2-hpc-devel \
openmpi2-gnu-hpc-devel"

inherit rpm
