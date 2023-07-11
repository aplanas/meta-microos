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

RPM_NAME = "libmumps_5_3_5-gnu-mpich-hpc-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "b4833e1f034d2ad99a898a812e1160fdda3c89e61106cfc1344ec28cdc4ca1dbcf355b13de26e4ff6a9fb40a0c2bb8460bec578bea54b7c594ff3cc16d2a6290"

RPROVIDES:${PN} += "libmumps-5-3-5-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
