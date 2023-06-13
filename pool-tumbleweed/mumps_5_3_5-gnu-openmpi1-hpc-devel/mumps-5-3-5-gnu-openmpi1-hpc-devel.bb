SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "1af11c8a9f8b85b9e4afe7694a2abd70973e997fa6ca7a888f8e914281de5e14eda14beb52f5f3e001d078fb59265a6833504d5e74119542dfc69950f652546f"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi1-hpc-devel \
mumps_5_3_5-gnu-openmpi1-hpc-devel(aarch-64)"

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
libmumps_5_3_5-gnu-openmpi1-hpc \
libscalapack2-gnu-openmpi1-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
