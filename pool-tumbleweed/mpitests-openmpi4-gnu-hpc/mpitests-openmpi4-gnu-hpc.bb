SUMMARY = "MPI Benchmarks and tests for openmpi4-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "bc12e246e7308cd8768aac79d116be5d33ce527a54d0db30654d1a7af01a79b9d46a3c59aed71eb5197127631a1ade985c2d32c060373a229ca0ebcb77d423ec"

RPROVIDES:${PN} += "mpitests-openmpi4-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi4-gnu-hpc"

inherit rpm
