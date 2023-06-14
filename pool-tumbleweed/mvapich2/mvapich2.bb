SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-2.3.7-4.3.aarch64.rpm"
RPM_HASH = "d56cee5fd493515ccace903037c25df0366bc8db5b63a4df3dadaa23af3fffac5c19f046137639180f017af9e576c65e2e50f4d3af75ce39b02f29ab38ec0740"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mvapich2"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libibmad.so.5 \
libibumad.so.3 \
libibverbs.so.1 \
libm.so.6 \
libnuma.so.1 \
libpciaccess.so.0 \
librdmacm.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
mpi-selector"

inherit rpm
