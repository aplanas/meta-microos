SUMMARY = "MPI Benchmarks and tests for openmpi2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi2-3.2-12.1.aarch64.rpm"
RPM_HASH = "411232c192cd8d60dc78d272e8dd04c99a48697099378ade1d2c46e0f0b2462ef4e4e0785dbe036b04fc33c59e9ee47691e167c5069ee317d0a0a9c2039a9b0d"

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
