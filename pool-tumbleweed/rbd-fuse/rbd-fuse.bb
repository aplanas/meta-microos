SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client to map Ceph rbd images to files"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-fuse-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "687d7df8f5b6961c620700c369762f713553cbd6dffcd0e4892e2d04640c500f81d17b19bb7333eb325b5528bcb4f3bd64afdb87e793592bc089d248b367f0ad"

RPROVIDES:${PN} += "rbd-fuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libfuse.so.2 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
librbd.so.1 \
librbd1 \
libstdc++.so.6"

inherit rpm
