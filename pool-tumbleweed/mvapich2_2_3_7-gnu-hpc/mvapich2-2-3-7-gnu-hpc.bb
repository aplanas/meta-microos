SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "98cefca805eb900d5753a2a4a1a7329f19aa57c37adc4741b8c27a429fa0c76c0e1c22fea52775195dddceaeb691b20be6921edb6c20e3a83670ec0d62ab8611"

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
