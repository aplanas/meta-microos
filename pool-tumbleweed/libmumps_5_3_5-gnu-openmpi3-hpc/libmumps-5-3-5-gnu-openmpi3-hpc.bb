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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi3-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "1fea035cae8d64d8006437b94805e6cbd7a3c9966fe7c5f540c60ef549843db84823fe00f731e4e5386506dde5b4204cdd1e6dfdac8592053a19ed44a6d2baa9"

RPROVIDES:${PN} += "libmumps-5-3-5-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi3-gnu-hpc \
lua-lmod"

inherit rpm
