SUMMARY = "MPI Benchmarks and tests for mpich"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-3.2-11.3.aarch64.rpm"
RPM_HASH = "693fdcb6ea9e2dd11bbd617f80f6f70eeb78624d92f98fec0058f4071800018dd47b3e257ed3f478639f6877eef5ba4d0c18eb379118ab218d55a3519dcb4e89"

RPROVIDES:${PN} += "mpitests-mpich \
mpitests-mpich(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.12()(64bit) \
libstdc++.so.6()(64bit) \
mpich \
mpitests"

inherit rpm
