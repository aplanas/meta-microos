SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library with Scotch support enabled."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi2-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "d823ced697135e9823775afd9196e83ea07835bf70913b3f947d5777afe065824c79e42781755c17f6f2a35fe42031813c432b1786df6b37f1c2c6e5f3df4b1e"

RPROVIDES:${PN} += "libcmumps_ptscotch.so.5.3.5()(64bit) \
libdmumps_ptscotch.so.5.3.5()(64bit) \
libmumps-ptscotch5_3_5-openmpi2 \
libmumps-ptscotch5_3_5-openmpi2(aarch-64) \
libmumps_common.so.5.3.5()(64bit) \
libpord_ptscotch.so.5.3.5()(64bit) \
libsmumps_ptscotch.so.5.3.5()(64bit) \
libzmumps_ptscotch.so.5.3.5()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libblacs.so.2.1.0()(64bit) \
libblacs2-openmpi2 \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.20()(64bit) \
libmpi_mpifh.so.20()(64bit) \
libmpi_usempi_ignore_tkr.so.20()(64bit) \
libmpi_usempif08.so.20()(64bit) \
libptscotch.so.0()(64bit) \
libscalapack.so.2.1.0()(64bit)"

inherit rpm
