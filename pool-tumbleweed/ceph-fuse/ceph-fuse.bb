SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client for Ceph distributed network file system"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-fuse-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "cd6754bb3f6c2cc26d8ac7044d812a239daa0c7fb30a42e0f0ce5d9f9214e74df0b9f553d03c07c7fd298e0673facdf115a988eeefaa8c2d288b5ede2102be45"

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
