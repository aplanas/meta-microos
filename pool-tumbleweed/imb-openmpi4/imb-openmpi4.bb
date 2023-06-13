SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi4-2021.3-1.2.aarch64.rpm"
RPM_HASH = "af329fb5b35ba5aa4f5eedab9f59637cdd9e8c5826b719d182242d8e3b520677222e7fd882009112139dcfef475fa766405aeda663e8f0c541e4a8d5fa21a185"

RPROVIDES:${PN} += "imb-openmpi4 \
imb-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
