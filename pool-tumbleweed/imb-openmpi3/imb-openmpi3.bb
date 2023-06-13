SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-openmpi3-2021.3-1.2.aarch64.rpm"
RPM_HASH = "799a996ca8bf3d7f541f0805e8303262e6f8ec8c3342d1d908e6e9d8049f728898c0be80f3fafb4f020c4b70505d2dc3b2ad80211b87e18eedb5416adb6ac41a"

RPROVIDES:${PN} += "imb-openmpi3 \
imb-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
