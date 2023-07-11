SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-mvapich2-hpc-2021.3-1.3.aarch64.rpm"
RPM_HASH = "40e536232ab195d3180ffeecb69636bd12dcf91f07c22f5f94b4aab043f7a345444f2696416ceee3a0e6e56d663a0de4ed63ec9a8937415561678c4618a83341"

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
