SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "228d1a1622d3d7b27885d14fddb278b34c035d343ef03a344e12b5a90a40a090f35e2ac5a81e0e113d938ebfdca944bf9772b86a2bb4590f5383126a0344dd09"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-mvapich2-hpc-devel \
mumps_5_3_5-gnu-mvapich2-hpc-devel(aarch-64)"
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
libmumps_5_3_5-gnu-mvapich2-hpc \
libscalapack2-gnu-mvapich2-hpc-devel \
mvapich2-gnu-hpc-devel"

inherit rpm
