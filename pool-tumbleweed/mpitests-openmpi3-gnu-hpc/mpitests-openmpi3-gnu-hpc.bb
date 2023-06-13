SUMMARY = "MPI Benchmarks and tests for openmpi3-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi3-gnu-hpc-3.2-11.2.aarch64.rpm"
RPM_HASH = "290f93d3c16fd8fb309f57b3e11464fbffb0cef2b17581fefe9380ad4cc8d421667ea2302cf4467702a4db21d3514a01dfc45968e82f153b893ece4650f750be"

RPROVIDES:${PN} += "mpitests-openmpi3-gnu-hpc \
mpitests-openmpi3-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit) \
mpitests \
openmpi3-gnu-hpc"

inherit rpm
