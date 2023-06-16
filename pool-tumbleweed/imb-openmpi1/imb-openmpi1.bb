SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi1-2021.3-1.2.aarch64.rpm"
RPM_HASH = "2e25a19098b1a03447da1fce7f7cd011670174e17f5dcdfcb5c2d25dcb6d92998a23a7cc19d71185fb7e4daae7546b768534053fd11e905430450895d08cecf6"

RPROVIDES:${PN} += "imb-openmpi1"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
