SUMMARY = "MPI Benchmarks and tests for openmpi1-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi1-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "f78e6660364cc7b75c722f73a11f75a70b61619f3035948e64b223fac7bc3c61291bfbf94e08ed9df842e48f6dd765cd698cf2d50c561d0bc5525c537c735472"

RPROVIDES:${PN} += "mpitests-openmpi1-gnu-hpc"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
openmpi1-gnu-hpc"

inherit rpm
