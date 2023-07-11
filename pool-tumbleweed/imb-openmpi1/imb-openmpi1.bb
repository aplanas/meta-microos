SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi1-2021.3-1.3.aarch64.rpm"
RPM_HASH = "d9847ad38c9fb927adfd7fc80c847d569ae34757c8615f865d605bd1821873d25da8c2285b7aa4ca0ed9d0ab399a5d35bdd627ccd8b917769808eca6b2bc5852"

RPROVIDES:${PN} += "imb-openmpi1"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
