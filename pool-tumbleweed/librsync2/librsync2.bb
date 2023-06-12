SUMMARY = "A Library for Generating Network Deltas"
DESCRIPTION = "librsync implements the 'rsync' algorithm, which allows remote \
differencing of binary files.  librsync computes a delta relative to a \
file's checksum, so the two files need not both be present to generate \
a delta."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "librsync2-2.3.4-1.2.aarch64.rpm"
RPM_HASH = "5f0dae228fc0b0f57d543898b18a938dac0a6b3b41a72f6370c63d733813608f1e992067802ebd5f593d0f9a125c7e14800187ca1f08a14f69c740d886c2949e"

RPROVIDES:${PN} += "librsync \
librsync.so.2()(64bit) \
librsync2 \
librsync2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
