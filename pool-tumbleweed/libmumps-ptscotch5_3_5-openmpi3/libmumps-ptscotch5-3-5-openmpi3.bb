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

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi3-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "51363aa386e56aa729cd445d83b0ebbee15cad48d915f40f50d769c58248eec5275997b0480c9ecf435271968bf6880a51aca583adb48ed785769079ea64a14c"

RPROVIDES:${PN} += "libcmumps-ptscotch.so.5.3.5 \
libdmumps-ptscotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi3 \
libpord-ptscotch.so.5.3.5 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblacs2-openmpi3 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libptscotch.so.0 \
libscalapack.so.2.1.0"

inherit rpm
