SUMMARY = "MPI Benchmarks and tests for openmpi1"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi1-3.2-12.1.aarch64.rpm"
RPM_HASH = "606edbde44649bc08e492a616d3dd8fb1c1fa390fc1e6cb8ca256c8f99bac7b9bc19675bd66ecff768fd4cf9996c84e38645fe5ce5dfe7cf05e7b33f005ab67b"

RPROVIDES:${PN} += "mpitests-openmpi1"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
openmpi1"

inherit rpm
