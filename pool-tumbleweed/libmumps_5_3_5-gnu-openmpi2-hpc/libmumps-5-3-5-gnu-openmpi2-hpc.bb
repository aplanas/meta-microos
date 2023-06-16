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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi2-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "c5b78f8196a279ad9f53290334c1707cea147a167fa29d96666aa5715117d00c8633ec017ba741da86bc60e44d7807f4854a9e74cc4109f5398fc505112481a3"

RPROVIDES:${PN} += "libmumps-5-3-5-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
