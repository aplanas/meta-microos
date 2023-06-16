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

RPM_NAME = "libmumps_5_3_5-gnu-mpich-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "d53a260dae2bcddfcfbe6971e0e2c8ab46173120efd1d1deab260709d5de707704952bc6fd82c365db68bb7425add7557b13aad30ed73cd620bfdc7cd9c41e57"

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
