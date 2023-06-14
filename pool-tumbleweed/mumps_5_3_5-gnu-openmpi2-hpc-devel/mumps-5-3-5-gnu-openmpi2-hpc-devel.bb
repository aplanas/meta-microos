SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "cc7631d65f6e7b95e5c5284d6d29ff9c2c0119ce3f0612ca9ac47ce567ffb8f4930aad0a8288e2043d46c70c76077ed7515cf7f3e20adaf86f5a74bf74266899"

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
