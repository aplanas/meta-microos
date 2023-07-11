SUMMARY = "MPI Benchmarks and tests for openmpi2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi2-3.2-11.4.aarch64.rpm"
RPM_HASH = "b64747f204b5e3cfd67bb593fc14bc21aa091e8207c0b68804c4c87485f2c199e4684e49a61171c22b705a349138676dfe718bc7c560a2bcecd1b14d796bf554"

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
