SUMMARY = "MPI Benchmarks and tests for openmpi3-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi3-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "33aa3a58f8cfc1fc36220c6515cc7baf5683a3728738177c3a7c9654748db6b57085a6b3f9478b58365f97715dc5576ac260c73eeca05d1f68d1279ecbc47f73"

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
