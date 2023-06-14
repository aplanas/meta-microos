SUMMARY = "GlusterFS's core library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libglusterfs0-11.0-2.1.aarch64.rpm"
RPM_HASH = "3a030e22b4ad96fe0053e13461d639b027f913e38c41ecc7f868c6dcb96fa24bf7909f166215a18c077b33ed44ce2e354e0a0be9feb9c940f35f99b752597352"

RPROVIDES:${PN} += "libglusterfs.so.0 \
libglusterfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
