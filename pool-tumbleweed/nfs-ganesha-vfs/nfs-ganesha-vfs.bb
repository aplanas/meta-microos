SUMMARY = "VFS backend for NFS-Ganesha"
DESCRIPTION = "This package contains a FSAL shared object to \
be used with NFS-Ganesha to support VFS based filesystems"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-vfs-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "df90a90599602fa3c4450b357ccb9f8839940678acc2022e59900bf211371b5b305871f3049f242761a09c3469d99edfd6978ad251e8068a918a7feafef2f43d"

RPROVIDES:${PN} += "config-nfs-ganesha-vfs \
libfsalvfs.so \
nfs-ganesha-vfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
nfs-ganesha"

inherit rpm
