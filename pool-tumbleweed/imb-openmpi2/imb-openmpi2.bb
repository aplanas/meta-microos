SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi2-2021.3-1.3.aarch64.rpm"
RPM_HASH = "fd2044cf45f0486540b367a1946f3371f4ba671774aaaa110839c10be92e82d5bbf0df2bbcb1b06517e57dc55fca0b4f5973ec8b0c6bd1cddd3c3afa5bcfb0a5"

RPROVIDES:${PN} += "imb-openmpi2"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.20 \
libstdc++.so.6"

inherit rpm
