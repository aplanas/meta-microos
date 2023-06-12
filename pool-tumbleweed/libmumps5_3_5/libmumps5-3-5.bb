SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_family} and ."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "676de5bf507509d02347ce04900c7bb4d8e28183da66c32a16e547ededd91e6b4e9ac9150a9dcdab7cd2d3144b5a0443957df5fd6b9bcaa61e73bbb6f1c44d81"

RPROVIDES:${PN} += "libcmumps_seq.so.5.3.5()(64bit) \
libdmumps_seq.so.5.3.5()(64bit) \
libmpiseq_seq.so.5.3.5()(64bit) \
libmumps5_3_5 \
libmumps5_3_5(aarch-64) \
libmumps_common.so.5.3.5()(64bit) \
libpord_seq.so.5.3.5()(64bit) \
libsmumps_seq.so.5.3.5()(64bit) \
libzmumps_seq.so.5.3.5()(64bit)"
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
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
