SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-mpich-2021.3-1.2.aarch64.rpm"
RPM_HASH = "751743d89e400ea7d68296a0e3bc8fb98705a0d0372626a94b2e9c886690e37af8bb10b4d8fc04a4762fd9b83b6c7b31a7a040692f0785be15fc30fd3e0b2241"

RPROVIDES:${PN} += "imb-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
