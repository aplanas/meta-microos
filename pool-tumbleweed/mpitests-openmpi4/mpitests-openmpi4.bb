SUMMARY = "MPI Benchmarks and tests for openmpi4"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-3.2-11.3.aarch64.rpm"
RPM_HASH = "f49178636a8bbe54b4ae273c623e64227561e4cba307b37ee4101d3af12d5ff962e6facc65d292ac82d95772461bd663ad40b1b80660f662aae05afcd10576e4"

RPROVIDES:${PN} += "mpitests-openmpi4"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6 \
mpitests \
openmpi4"

inherit rpm
