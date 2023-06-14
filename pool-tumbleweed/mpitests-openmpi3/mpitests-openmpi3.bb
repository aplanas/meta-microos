SUMMARY = "MPI Benchmarks and tests for openmpi3"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi3-3.2-11.3.aarch64.rpm"
RPM_HASH = "9d4bce605d5dd260e5331dc27f5e2f50ea3fa29303d08825ab515b7b49e2805c68f1fcb9eb6ce176a0b2c973c816e726c0164e6fde46d76e0e9f309a4a17b2b4"

RPROVIDES:${PN} += "mpitests-openmpi3"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi3"

inherit rpm
