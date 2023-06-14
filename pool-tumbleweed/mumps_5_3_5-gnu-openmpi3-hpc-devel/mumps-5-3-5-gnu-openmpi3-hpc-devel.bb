SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-devel-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "d18ae7c7ebbcac39970f14d3ee46e5d2e8c1639964cc341d51db659d84199d9e0915aa595ad12c7b5b56b94a0e80dbd207b1e8c3c2e987c49d419c52b5b7f9c4"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi3-hpc \
libscalapack2-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
