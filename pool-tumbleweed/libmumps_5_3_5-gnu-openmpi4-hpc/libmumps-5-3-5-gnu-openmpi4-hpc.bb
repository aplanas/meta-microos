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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi4-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "430dd25d126d594802f2c27ce4d9faf4e75c76334781fa97f7dc2b1f633d36edcd9c98f290eb9fb6896c2122ad02c89c9735040167292a87d871df9cefd5667c"

RPROVIDES:${PN} += "libmumps-5-3-5-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
