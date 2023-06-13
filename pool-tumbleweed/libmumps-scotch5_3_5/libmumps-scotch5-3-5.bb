SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_family} and  with Scotch support enabled."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-scotch5_3_5-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "0ed79e00ecbae1702ac2be6eea76e359ca48cd9dda49f65ae816d4b635c13821a7f2d3d28688542ddd2b036a9b5d34800f096986bd2763483abd61b6560af6ce"

RPROVIDES:${PN} += "libcmumps_scotch.so.5.3.5()(64bit) \
libdmumps_scotch.so.5.3.5()(64bit) \
libmpiseq_scotch.so.5.3.5()(64bit) \
libmumps-scotch5_3_5 \
libmumps-scotch5_3_5(aarch-64) \
libmumps_common.so.5.3.5()(64bit) \
libpord_scotch.so.5.3.5()(64bit) \
libsmumps_scotch.so.5.3.5()(64bit) \
libzmumps_scotch.so.5.3.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
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
libscotch.so.0()(64bit)"

inherit rpm
