SUMMARY = "Ceph fuse-based client"
DESCRIPTION = "FUSE based client to map Ceph rbd images to files"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-fuse-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "a92a9e78a8e7b4444d8a681e9a9d5daf106ce736730e34fd8c25c16b229ff47a5559adf4d9c749521dc935bcc5184f4b3869458e4d03793960a9239c80986801"

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
