SUMMARY = "MPI Benchmarks and tests for openmpi1"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi1-3.2-11.4.aarch64.rpm"
RPM_HASH = "47a92544f5c51b7537bc3757cddbd4334c1064f88cb1f5de7e91f879a71678da4f9341dc316755a185a1004b0c8be4a82cac2a5dbfc37562db09b7d254c169a1"

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
