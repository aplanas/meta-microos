SUMMARY = "MPI Benchmarks and tests for mpich-ofi"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-3.2-11.4.aarch64.rpm"
RPM_HASH = "b018bd6ce96356659e655d90d39e071809bcbcb1c4ecb24f928d2c1fd4bd5e15945e8120f8a1c87062f12fd3c355131b36b60e71b7c6afe9e71a6c90ba2e7209"

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
