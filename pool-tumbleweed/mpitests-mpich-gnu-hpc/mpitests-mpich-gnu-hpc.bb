SUMMARY = "MPI Benchmarks and tests for mpich-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "0762dbbda2e15d8e13fbdd5a9eb936b2a9e6578c6ebcc1cd7aa4f6a63b6fda6d9e765e8dd2067c541f34c1db4d33110c912ebba74f28a037bcbcb305f2e3d37e"

RPROVIDES:${PN} += "mpitests-mpich-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpich-gnu-hpc \
mpitests"

inherit rpm
