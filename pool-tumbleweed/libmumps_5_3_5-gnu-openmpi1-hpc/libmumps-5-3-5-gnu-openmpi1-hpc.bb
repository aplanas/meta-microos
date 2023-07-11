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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi1-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "3d6791f1e816f6d35ca0304be2b792e319af9488978caca0b9d8ab825cb694be6a7469f522a6b64281e83b6570670a37b4b28d2d449c968be5c70b551e999093"

RPROVIDES:${PN} += "libmumps-5-3-5-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi1-gnu-hpc \
lua-lmod"

inherit rpm
