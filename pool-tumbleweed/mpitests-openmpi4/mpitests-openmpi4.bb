SUMMARY = "MPI Benchmarks and tests for openmpi4"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-3.2-12.1.aarch64.rpm"
RPM_HASH = "c32c966ba446a8b22b6781f6f2e5a9eeb3f6ea8b8d96131afc4bd691c94e5d4142ea4de38fba11f77302973daeb2dfee6c3f783a6bd0c41e2a44d21f17599750"

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
