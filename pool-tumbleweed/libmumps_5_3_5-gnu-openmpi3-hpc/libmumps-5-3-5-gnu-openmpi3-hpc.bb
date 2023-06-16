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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi3-hpc-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "0f4715b63032af41e3c99d4c7af85df4062ef6a7dd4f7fc884dc8aae5efeaee73b61b77671a966933a2062f4bd47b996413f0a9861c1a63e3fbb313122337a6b"

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
