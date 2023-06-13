SUMMARY = "MPI Benchmarks and tests for mvapich2-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-gnu-hpc-3.2-11.3.aarch64.rpm"
RPM_HASH = "b92de52b0b1b8303a97bda6ee447035f0bf513d7d05974599befbe4b8614169bbdb3fcc0ba9bfeed99eee2c07e44d7fe59c915633fa6b4e015ae861663fc0416"

RPROVIDES:${PN} += "mpitests-mvapich2-gnu-hpc \
mpitests-mvapich2-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.12()(64bit) \
libstdc++.so.6()(64bit) \
mpitests \
mvapich2-gnu-hpc"

inherit rpm
