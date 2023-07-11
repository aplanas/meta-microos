SUMMARY = "MPI Benchmarks and tests for openmpi4-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "c78500ee76abe9a8c255b198178fd46dea83901d1555c0d43811f1622bc5f5be1aa135ea765dbc3c3c06b3b20bb2205078dd587626af334b3d439d7f090d0696"

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
