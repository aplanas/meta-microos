SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-mvapich2-2021.3-1.3.aarch64.rpm"
RPM_HASH = "be8031bb3be5a34a81f945e818fe75804934150dceb75f9b3ef91dfa8d45ab4f2971d45a3737740b29003d9f068acb89b65bfab4783a8846200c708c32d88823"

RPROVIDES:${PN} += "imb-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6"

inherit rpm
