SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-mpich-2021.3-1.3.aarch64.rpm"
RPM_HASH = "b230e85999a660eda4d64679df9a0e730ffba09e8b9a06ff0ecbc81eb283a674c26d4e23b30f02decb807b9c90f4fd2d16ec98ba44c2e84ac39d974f1ea088a8"

RPROVIDES:${PN} += "imb-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
