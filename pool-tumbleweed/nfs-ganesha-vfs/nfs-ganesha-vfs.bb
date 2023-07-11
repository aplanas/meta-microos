SUMMARY = "VFS backend for NFS-Ganesha"
DESCRIPTION = "This package contains a FSAL shared object to \
be used with NFS-Ganesha to support VFS based filesystems"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-vfs-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "0911e2ac20ba4f6731138fa251925475ef2c6e5ad0d897e322a62fc3974630c9c7cf8ad58e013fca2b4d4433adbfff8b4b18461be239ac637964ef83e675cb7b"

RPROVIDES:${PN} += "config-nfs-ganesha-vfs \
libfsalvfs.so \
nfs-ganesha-vfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
nfs-ganesha"

inherit rpm
