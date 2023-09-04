SUMMARY = "MPI Benchmarks and tests for openmpi1-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi1-gnu-hpc-3.2-12.1.aarch64.rpm"
RPM_HASH = "82d79208ac15a22a079697b614893d9990a6f60b461d77beff448a8fb3feecdacfb74a7bfd639742cd65d6bb9c054ccc04004ad52fc09a16df614e9f7b618319"

RPROVIDES:${PN} += "mpitests-openmpi1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
openmpi1-gnu-hpc"

inherit rpm
