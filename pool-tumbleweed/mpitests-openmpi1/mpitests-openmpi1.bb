SUMMARY = "MPI Benchmarks and tests for openmpi1"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi1-3.2-11.3.aarch64.rpm"
RPM_HASH = "752bed2678c6a38539f0506344dd9979d514675fb7bb68ab1cd9fe17499eda799599ef67baf4eac10ca9f94535115ca49686a7cbe4fa242b92de59cf70f8068d"

RPROVIDES:${PN} += "mpitests-openmpi1 \
mpitests-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.12()(64bit) \
libmpi_cxx.so.1()(64bit) \
libstdc++.so.6()(64bit) \
mpitests \
openmpi1"

inherit rpm
