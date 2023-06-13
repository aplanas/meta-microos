SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2_2_3_7-gnu-hpc-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "98cefca805eb900d5753a2a4a1a7329f19aa57c37adc4741b8c27a429fa0c76c0e1c22fea52775195dddceaeb691b20be6921edb6c20e3a83670ec0d62ab8611"

RPROVIDES:${PN} += "mvapich2_2_3_7-gnu-hpc \
mvapich2_2_3_7-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libhwloc.so.15()(64bit) \
libibmad.so.5()(64bit) \
libibumad.so.3()(64bit) \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit) \
libpciaccess.so.0()(64bit) \
librdmacm.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
lua-lmod"

inherit rpm
