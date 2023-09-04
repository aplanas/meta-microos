SUMMARY = "Ceph daemon for mirroring CephFS snapshots"
DESCRIPTION = "Daemon for mirroring CephFS snapshots between Ceph clusters."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-mirror-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "5d03dbaf1c146cd266e5e6d9d446704e915eceaf37faa0f087551108421b8e22e2b431b8898fc529881d3b975059f17e78bb3446ec21de9cf761dfcf2938c2a3"

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
