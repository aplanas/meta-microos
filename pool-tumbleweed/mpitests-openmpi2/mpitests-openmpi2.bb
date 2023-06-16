SUMMARY = "MPI Benchmarks and tests for openmpi2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi2-3.2-11.3.aarch64.rpm"
RPM_HASH = "190e19142e9012f0e56c6e206687311f5e239c19ac30570160ab32fa50022d2c560cf3872e88682aa6fe3e80b7a7f78e158d2d219b6919dd91376b9a9a8e9d93"

RPROVIDES:${PN} += "mpitests-openmpi2"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.20 \
libstdc++.so.6 \
mpitests \
openmpi2"

inherit rpm
