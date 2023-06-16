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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi1-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "97de3cc7946ca9526bc9f287cc8fd5df5b0ba34a20e07fc2a48bb414f21130e02e9ce66d13649817f159f34c39ad42f34d24902404800f9e85884d2a98178e9d"

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
