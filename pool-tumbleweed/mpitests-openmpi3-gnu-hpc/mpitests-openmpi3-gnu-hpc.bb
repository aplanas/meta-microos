SUMMARY = "MPI Benchmarks and tests for openmpi3-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi3-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "aa88524aa763827808da496e196c14dcb900d164a6dac6ed527d580172dd9a1c5367ad6418d3a6297ea33bb324eec9ff94e7339c0a503fd7d8a08dcec460b5a2"

RPROVIDES:${PN} += "mpitests-openmpi3-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi3-gnu-hpc"

inherit rpm
