SUMMARY = "Ceph daemon for mirroring CephFS snapshots"
DESCRIPTION = "Daemon for mirroring CephFS snapshots between Ceph clusters."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-mirror-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "fd49412536961220f3f3792f37819bda1cda6c38becb990aa04a4371afcdf8b4c5b6e69bb0a19d90a3a87b36d5c21d8ca3c221a61396fdf0eee71e5f836fb0b0"

RPROVIDES:${PN} += "cephfs-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
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
