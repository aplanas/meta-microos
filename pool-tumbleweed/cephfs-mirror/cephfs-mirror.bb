SUMMARY = "Ceph daemon for mirroring CephFS snapshots"
DESCRIPTION = "Daemon for mirroring CephFS snapshots between Ceph clusters."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-mirror-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "39f1d0311f4b1491f4fc86c3b523eff6f55153a179408728c0117083a466cae7a428633990a24c3f8124897a6870d736c2a61faa74954ac615599c4f00964ddf"

RPROVIDES:${PN} += "cephfs-mirror"

RDEPENDS:${PN} += "/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcephfs.so.2 \
libcephfs2 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
