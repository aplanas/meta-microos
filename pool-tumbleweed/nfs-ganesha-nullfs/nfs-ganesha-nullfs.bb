SUMMARY = "'null' filesystem backend for NFS-Ganesha"
DESCRIPTION = "This package contains a Stackable FSAL shared object to \
be used with NFS-Ganesha. This is mostly a template for future (more sophisticated) stackable FSALs"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-nullfs-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "d8f65b84a3b124e7654d76e9579f9fdc4701d73a807d8e007cc70e60312f95349091c3781403ee5c6f2ec726f37c873f9bbfc0b721cb05b9605b5e4e64e6bf18"

RPROVIDES:${PN} += "libfsalnull.so \
nfs-ganesha-nullfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
nfs-ganesha"

inherit rpm
