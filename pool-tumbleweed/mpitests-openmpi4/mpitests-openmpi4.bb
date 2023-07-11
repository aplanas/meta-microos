SUMMARY = "MPI Benchmarks and tests for openmpi4"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-3.2-11.4.aarch64.rpm"
RPM_HASH = "fae4c078b10707c44ee828b96f424768ab034ad6b9b4ed3e62361af7c98fab4dd45bc464a1ff5c11cc3fe9dc10cc62e404fd607894bd78cb40ae78dade6c382d"

RPROVIDES:${PN} += "mpitests-openmpi4"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi4"

inherit rpm
