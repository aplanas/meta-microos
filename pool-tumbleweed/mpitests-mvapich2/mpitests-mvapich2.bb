SUMMARY = "MPI Benchmarks and tests for mvapich2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-3.2-11.4.aarch64.rpm"
RPM_HASH = "805e551bd9fa4874b9e8e1c7d8e7a4b54b8515289efb9e6d7d884157efb96bde7e1b3d114589e66a00f6ac8cc72838a82d2da63cb66a86bcbb1e4535247b65c3"

RPROVIDES:${PN} += "mpitests-mvapich2"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich2"

inherit rpm
