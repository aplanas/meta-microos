SUMMARY = "Ceph Monitor Daemon"
DESCRIPTION = "ceph-mon is the cluster monitor daemon for the Ceph distributed file \
system. One or more instances of ceph-mon form a Paxos part-time \
parliament cluster that provides extremely reliable and durable storage \
of cluster membership, configuration, and state."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mon-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "9a60f07fc1d76db649f342351cb2b5b660fa8a89cd5ced52205c1565bb4e3cee7db40d1bff0468d0496718787686da45c2321d81752e5defb6c308b62ded9ddf"

RPROVIDES:${PN} += "ceph-mon \
ceph-test-/usr/bin/ceph-monstore-tool"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libleveldb.so.1 \
liblz4.so.1 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
libtcmalloc.so.4 \
libz.so.1"

inherit rpm
