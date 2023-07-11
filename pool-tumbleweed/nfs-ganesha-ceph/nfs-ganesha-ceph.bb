SUMMARY = "CephFS backend for NFS-Ganesha"
DESCRIPTION = "This package contains the Ceph 'file' (CephFS) File System Abstraction Layer \
(FSAL)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-ceph-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "a02b941b63f73f46b9c500b2e36e9af497ad4d67806ea4a88e8dfde6624d14ebc0e274d50c45ead0c8743fd1ead6387c91f0c9bbbffb63d8c625159fde5be0a4"

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
