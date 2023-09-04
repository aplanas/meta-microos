SUMMARY = "MPI Benchmarks and tests for openmpi2-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi2-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "4fd7187d62214bad9aee7c6b6e3e4be294886dacc3181a9ac1e371d1c691bc5ad2f0c91d27fb1e216aefa11a355d42b741e8f332178b6fdf1816975f94e42e86"

RPROVIDES:${PN} += "mpitests-openmpi2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.20 \
libstdc++.so.6 \
mpitests \
openmpi2-gnu-hpc"

inherit rpm
