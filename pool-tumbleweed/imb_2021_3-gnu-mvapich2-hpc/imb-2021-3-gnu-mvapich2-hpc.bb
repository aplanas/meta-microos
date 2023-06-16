SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-mvapich2-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "a14b7d2072217ebfccf3afb320ad6f485f247a4af032144fccb5fedd0fa90704c5c57f67ba23edb06ffe63bfefcc7089b587d137abe355644ab0fbb88dd5a7f6"

RPROVIDES:${PN} += "imb-2021-3-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
