SUMMARY = "MPI Benchmarks and tests for openmpi3"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi3-3.2-11.4.aarch64.rpm"
RPM_HASH = "728dd18cc08d22530bee6de2238ed296cd9942a3da1ddf03d3a6c9877c83663ef8bfd6e057aa4e28ee6220e723a02007332fd79ba2a9993d2dbf53d981253059"

RPROVIDES:${PN} += "mpitests-openmpi3"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi3"

inherit rpm
