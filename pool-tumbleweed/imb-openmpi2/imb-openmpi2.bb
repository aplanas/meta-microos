SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi2-2021.3-1.2.aarch64.rpm"
RPM_HASH = "05e1d637cb5ce59ad17cc386d174c9ff21d824444ba369889a7713c995a2d1cdec9685282166fe928f18777c23bcef473049f366252b9a3f504a040b57a14fbf"

RPROVIDES:${PN} += "imb-openmpi2"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.20 \
libstdc++.so.6"

inherit rpm
