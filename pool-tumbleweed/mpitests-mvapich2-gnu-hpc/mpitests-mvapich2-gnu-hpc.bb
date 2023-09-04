SUMMARY = "MPI Benchmarks and tests for mvapich2-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "52f0d0d8d6d82ccbc8778da8546640f05b03780e8dd7bb1e626838f981da6e8955a5b5a1a489edb76af9914236487546a9ed2fd8423045cae1d5050c9140e42b"

RPROVIDES:${PN} += "mpitests-mvapich2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich2-gnu-hpc"

inherit rpm
