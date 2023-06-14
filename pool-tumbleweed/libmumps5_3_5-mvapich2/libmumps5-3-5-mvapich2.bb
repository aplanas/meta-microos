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

RPM_NAME = "libmumps5_3_5-mvapich2-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "47a6a36f25ddbaa6b3a21710c2bbb086d7e8947e6b202cf9951ddd0ec143318f89f1c269a49c88f03c61dcbd5c066a8c81e476a15e90479cdde41e57ff7f3826"

RPROVIDES:${PN} += "libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-mvapich2 \
libpord.so.5.3.5 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblacs2-mvapich2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12 \
libmpifort.so.12 \
libscalapack.so.2.1.0"

inherit rpm
