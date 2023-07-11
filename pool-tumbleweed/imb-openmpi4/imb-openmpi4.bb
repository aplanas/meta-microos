SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi4-2021.3-1.3.aarch64.rpm"
RPM_HASH = "4f9af0361a7436aa9fcd6d79569f034a0e0328117db65556b54e0567a2f9c35d18d13f1fd974008341cf20628062ce891ae14243ac3b763b92c052c89fed82e6"

RPROVIDES:${PN} += "imb-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
