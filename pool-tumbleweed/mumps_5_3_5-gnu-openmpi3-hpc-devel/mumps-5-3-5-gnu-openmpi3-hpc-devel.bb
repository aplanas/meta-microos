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

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi3-hpc-devel \
mumps_5_3_5-gnu-openmpi3-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmumps_5_3_5-gnu-openmpi3-hpc \
libscalapack2-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm