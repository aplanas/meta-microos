SUMMARY = "MPI Benchmarks and tests for mpich-ofi-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "79c5d7026ff391c17c4d932885dbabfbc658995725ad8eb2cdbd2e94cdfbb55b06579a44946f6b6a1f6e8a1b0caa4188305c4159c7b324d0bd8977016cfcada8"

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
