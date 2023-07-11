SUMMARY = "Ceph RADOS Gateway backend for NFS-Ganesha"
DESCRIPTION = "This package contains the Ceph 'object' (RGW) File System Abstraction Layer \
(FSAL)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-rgw-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "2dd2997aa1c1526e81b598030113dbcb47206b052b6563e33853373d6844d74f5862e9c52d80b3359c37e1b1062db5d2b68d8175ee96f3faae71d8538a96d82c"

RPROVIDES:${PN} += "config-nfs-ganesha-rgw \
libfsalrgw.so \
nfs-ganesha-rgw"

RDEPENDS:${PN} += "ceph-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
librgw.so.2 \
nfs-ganesha"

inherit rpm
