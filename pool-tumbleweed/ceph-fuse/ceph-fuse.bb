SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client for Ceph distributed network file system"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-fuse-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "abcb911198cc5fddf9b5f2ad84b87d000df08f41285d0b0c32d577a924f34d46bb59f39b8a6c30c63d1cb215b82f51c6fd90d5440e406d27d4a1090c3e97e856"

RPROVIDES:${PN} += "ceph-fuse"

RDEPENDS:${PN} += "/usr/bin/python3 \
fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libfmt.so.9 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3"

inherit rpm
