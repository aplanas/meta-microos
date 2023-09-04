SUMMARY = "MPI Benchmarks and tests for mpich-ofi"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-3.2-12.1.aarch64.rpm"
RPM_HASH = "3a7cb488332e0f7f2827de5b045172b3e0ea179e061e83fe3425c0707bf2279dec42e2506701e0955dd06a48f02c8d1ad39179efcc3c1413d2f2125813a3c528"

RPROVIDES:${PN} += "mpitests-mpich-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpich-ofi \
mpitests"

inherit rpm
