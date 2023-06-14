SUMMARY = "CephFS backend for NFS-Ganesha"
DESCRIPTION = "This package contains the Ceph 'file' (CephFS) File System Abstraction Layer \
(FSAL)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-ceph-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "7dae87c11868c29b121357e032d07359bed2decfbc1bb4ea480c9ea96306bc1603d109e3b8601688913e50538a493702f3b58d34af780884b5fb9c2272e60538"

RPROVIDES:${PN} += "config-nfs-ganesha-ceph \
libfsalceph.so \
nfs-ganesha-ceph"

RDEPENDS:${PN} += "ceph-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libganesha-nfsd.so.3.3 \
nfs-ganesha"

inherit rpm
