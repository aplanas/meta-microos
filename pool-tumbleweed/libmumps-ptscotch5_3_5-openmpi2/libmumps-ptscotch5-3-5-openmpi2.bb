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

RPROVIDES:${PN} += "libcmumps-ptscotch.so.5.3.5 \
libdmumps-ptscotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi2 \
libpord-ptscotch.so.5.3.5 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblacs2-openmpi2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20 \
libmpi-usempi-ignore-tkr.so.20 \
libmpi-usempif08.so.20 \
libmpi.so.20 \
libptscotch.so.0 \
libscalapack.so.2.1.0"

inherit rpm
