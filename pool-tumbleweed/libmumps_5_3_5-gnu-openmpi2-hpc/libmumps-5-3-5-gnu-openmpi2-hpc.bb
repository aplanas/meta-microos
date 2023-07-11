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

RPM_NAME = "libmumps_5_3_5-gnu-openmpi2-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "a1b7b9be2dec059786e54018bc54baa997f54a1ffda8ae486c0ef636bd1b08c7ffec6889ed04c64bd1c2455007459157fa19f8ee52caecb8a875a734ecc15535"

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
