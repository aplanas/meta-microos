SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client for Ceph distributed network file system"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-fuse-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "fd9a4f8db2f37fa6a9f761106f9c6a9ec1a2f964c52dea5da273a78f2a0fdd994a23e7eaab5ea4a27e67d282cc1f70175c1cef620ccc441dd11033a34da373a9"

RPROVIDES:${PN} += "ceph-fuse \
ceph-fuse(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
fuse \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libfmt.so.9()(64bit) \
libfuse.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python3"

inherit rpm
