SUMMARY = "MPI Benchmarks and tests for openmpi2-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi2-gnu-hpc-3.2-11.4.aarch64.rpm"
RPM_HASH = "882cc3a16ab44e6cace9bc0e8579459bd13da31ed54b59dcce61a4133f2a88cea4a04b5ee75bd48d589828a56503dd3f7b791ee1fdeec535781234205b6826f3"

RPROVIDES:${PN} += "mpitests-openmpi2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.20 \
libstdc++.so.6 \
mpitests \
openmpi2-gnu-hpc"

inherit rpm
