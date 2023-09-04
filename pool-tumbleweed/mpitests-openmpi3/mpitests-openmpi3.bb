SUMMARY = "MPI Benchmarks and tests for openmpi3"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi3-3.2-12.1.aarch64.rpm"
RPM_HASH = "196678bba18247089937863df54e23fbf38aa8c0f08d00ce15968eed4229fa6152861b93acc8eebbca678d67f654582adcae52331000db46ea0d1e28ef59872f"

RPROVIDES:${PN} += "mpitests-openmpi3"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi3"

inherit rpm
