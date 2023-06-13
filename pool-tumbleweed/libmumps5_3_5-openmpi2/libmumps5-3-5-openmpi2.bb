SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi2-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "0cfae19f8316846cb02e1de7cfe7b17c0593921feda3f983cffdf19059d1b7a93d16e3cbdb3f4ba5348a04663921269f11bbc57b3d9c2ba0e699e31ee23341f3"

RPROVIDES:${PN} += "libcmumps.so.5.3.5()(64bit) \
libdmumps.so.5.3.5()(64bit) \
libmumps5_3_5-openmpi2 \
libmumps5_3_5-openmpi2(aarch-64) \
libmumps_common$.so.5.3.5()(64bit) \
libpord.so.5.3.5()(64bit) \
libsmumps.so.5.3.5()(64bit) \
libzmumps.so.5.3.5()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi2 \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.20()(64bit) \
libmpi_mpifh.so.20()(64bit) \
libmpi_usempi_ignore_tkr.so.20()(64bit) \
libmpi_usempif08.so.20()(64bit) \
libscalapack.so.2.1.0()(64bit)"

inherit rpm
