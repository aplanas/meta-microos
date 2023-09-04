SUMMARY = "MPI Benchmarks and tests for mpich-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "7e6b2775d0adcb160a30da0ac0714d9f6e748f9c659194998f0f84009dcd5e61eb37896840df4520edd9246c985a69cd3509e5f9fc90f03acb4dc400a34673c2"

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
