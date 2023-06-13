SUMMARY = "MPI Benchmarks and tests for mpich-ofi-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "b8587d475d171a75e4d62c63871aba611c3acecd95cd3d1a68e2167980c251b7621394884ebf2a30552508205820cebfd09c26533c74ebdce0291ad2c19492ab"

RPROVIDES:${PN} += "mpitests-mpich-ofi-gnu-hpc \
mpitests-mpich-ofi-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.12()(64bit) \
libstdc++.so.6()(64bit) \
mpich-ofi-gnu-hpc \
mpitests"

inherit rpm
