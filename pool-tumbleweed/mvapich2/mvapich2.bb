SUMMARY = "OSU MVAPICH2 MPI package"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 features. It \
is based on MPICH2 and MVICH."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-2.3.7-5.1.aarch64.rpm"
RPM_HASH = "0789e1c73550b6ee04178ea3cf14a09b4e256b4d7d9e4e2fba83e31a003a883a461d53432fd9bf174177d2683c0cca3c59300091b4afbc425636c60eb920357c"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mvapich2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
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
