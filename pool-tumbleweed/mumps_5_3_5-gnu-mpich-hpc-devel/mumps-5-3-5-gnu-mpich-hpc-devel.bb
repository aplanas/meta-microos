SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "0b84de41928e2b0d6bc14a12f1799cc823b4cb0b520ea81c401967bdb531e0fc9418a0048c58cc217ff1ee56aa55b7f70b3765da68cbdbd5f5cda9130568bbf4"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-mpich-hpc \
libscalapack2-gnu-mpich-hpc-devel \
mpich-gnu-hpc-devel"

inherit rpm
