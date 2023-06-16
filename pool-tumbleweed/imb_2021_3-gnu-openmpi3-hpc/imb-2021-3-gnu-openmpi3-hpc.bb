SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi3-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "ce3be2b589654799bc675a70cfc698acd8bb15f9abd029d58449782824b223a3119c71863dfe970d845c71ced4d7d84cdc9b4c067ac9a367fa56726b1d986b05"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi3-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
