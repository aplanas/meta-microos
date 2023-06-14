SUMMARY = "Boost.Log runtime Run-Time library"
DESCRIPTION = "This package contains runtime library for Boost.Log."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_log1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "922d7f5b29ac275710c200ed58ac1da3a96af417782a127b667dc176813e15f2f2f9e47a181bcb95bcc23ddfe2f95c5d1d5e0eb812c053988c6680cfe46c1270"

RPROVIDES:${PN} += "libboost-log-setup.so.1.82.0 \
libboost-log.so.1.82.0 \
libboost-log1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
