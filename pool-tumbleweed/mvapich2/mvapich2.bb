SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "d56cee5fd493515ccace903037c25df0366bc8db5b63a4df3dadaa23af3fffac5c19f046137639180f017af9e576c65e2e50f4d3af75ce39b02f29ab38ec0740"

RPROVIDES:${PN} += "libmpi.so.12()(64bit) \
libmpicxx.so.12()(64bit) \
libmpifort.so.12()(64bit) \
mvapich2 \
mvapich2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libibmad.so.5()(64bit) \
libibumad.so.3()(64bit) \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit) \
libpciaccess.so.0()(64bit) \
librdmacm.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
mpi-selector"

inherit rpm
