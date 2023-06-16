SUMMARY = "MPI Benchmarks and tests for openmpi2-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi2-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "2729168782c124fb53aec6e74f22dcc4a3638ee10872e243cc7f72e6ea7a3a3cebbced9826102a2aec83865db2ec7bd8b58a422c19d5fb1ccaa164e3d49b74b7"

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
