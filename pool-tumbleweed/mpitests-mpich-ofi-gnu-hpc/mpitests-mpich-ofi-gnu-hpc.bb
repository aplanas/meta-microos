SUMMARY = "MPI Benchmarks and tests for mpich-ofi-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-gnu-hpc-3.2-11.4.aarch64.rpm"
RPM_HASH = "04647b67ca3bf5be6269712dfc0639d549a36ab977ff91a31eca1c9e10e57c0e5f16be8bad451203de4d089afbf306d5b44f57becbc5ce5e6cb1b5518f78d4f3"

RPROVIDES:${PN} += "mpitests-mpich-ofi-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpich-ofi-gnu-hpc \
mpitests"

inherit rpm
