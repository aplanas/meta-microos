SUMMARY = "The NFS-Ganesha command for managing the RADOS grace database"
DESCRIPTION = "This package contains the ganesha-rados-grace tool for interacting with the \
database used by the rados_cluster recovery backend and the \
libganesha_rados_grace shared library for using RADOS storage for \
recovery state."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-rados-grace-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "555ce4c9df5b11fd171165b98a0d57f6b66d6b52000487d9895e5e3e951a82d86fbf788876a086aa5c50549ff9f366e5c1bcfc0eb78606b435372f219ce125fb"

RPROVIDES:${PN} += "libganesha-rados-recov.so \
nfs-ganesha-rados-grace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
librados.so.2 \
liburcu-bp.so.8 \
nfs-ganesha"

inherit rpm
