SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-mpich-hpc-2021.3-1.3.aarch64.rpm"
RPM_HASH = "3b14fb840be4f8dda240cef12d92325110396fb7e1e7400262db5a846d2877608b62a500813e3ac9fd30a15dc2f2944513b895b383d7400403cc5180797be100"

RPROVIDES:${PN} += "imb-2021-3-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
