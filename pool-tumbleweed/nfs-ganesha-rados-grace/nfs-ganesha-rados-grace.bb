SUMMARY = "The NFS-Ganesha command for managing the RADOS grace database"
DESCRIPTION = "This package contains the ganesha-rados-grace tool for interacting with the \
database used by the rados_cluster recovery backend and the \
libganesha_rados_grace shared library for using RADOS storage for \
recovery state."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-rados-grace-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "fd0cd84f58a0fc2382e95bbf32bf1ba7ebf3bdbf76fab4dcfee5d4f6225843f4cdebc55b8e5fb7cd69e31d6337ad796851725439728fdd782c89830c823ca386"

RPROVIDES:${PN} += "libganesha-rados-recov.so \
nfs-ganesha-rados-grace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
librados.so.2 \
liburcu-bp.so.8 \
nfs-ganesha"

inherit rpm
