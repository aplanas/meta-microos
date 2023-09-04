SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "788fed93608f003fd9ecacf97a8428cf6d74fd55e4b688767f08deb8f8ec6c10ba6ac22ed492b78111bc668d1b411e89b93d2de46363aa2d633e7ae78c098d71"

RPROVIDES:${PN} += "mvapich2-2-3-7-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhwloc.so.15 \
libibmad.so.5 \
libibumad.so.3 \
libibverbs.so.1 \
libm.so.6 \
libnuma.so.1 \
libpciaccess.so.0 \
librdmacm.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
lua-lmod"

inherit rpm
