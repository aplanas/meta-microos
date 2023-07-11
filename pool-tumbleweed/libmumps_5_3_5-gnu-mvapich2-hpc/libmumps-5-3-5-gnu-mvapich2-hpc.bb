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

RPM_NAME = "libmumps_5_3_5-gnu-mvapich2-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "61d10013e4f6fd5bc033593178144b2a755c0ecacef356a6f112a69ac259fef0c087f2b1d87fc07043ee397cc99b4ea9938fe40713ea847caaaf2fe2aa84adac"

RPROVIDES:${PN} += "libmumps-5-3-5-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
