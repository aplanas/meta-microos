SUMMARY = "Aggregating distributed file system"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. It aggregates various storage bricks over Infiniband RDMA \
or TCP/IP interconnect into one large parallel network file system. \
GlusterFS is one of the most sophisticated file systems in terms of \
features and extensibility. It borrows a powerful concept called \
Translators from GNU Hurd kernel. Much of the code in GlusterFS is in \
user space and easily manageable."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "glusterfs-11.0-2.1.aarch64.rpm"
RPM_HASH = "ee408f343f0509a4a46f6502a562ef43acdfb695044dbeba17d0978de1322a07a4b4c5f6b74a37a5300df82074bf865300cd61bb9688ed81cf07248d42d0fd0e"

RPROVIDES:${PN} += "config-glusterfs \
glusterfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgfapi.so.0 \
libgfapi0 \
libgfchangelog.so.0 \
libgfchangelog0 \
libgfrpc.so.0 \
libgfrpc0 \
libgfxdr.so.0 \
libgfxdr0 \
libglusterfs.so.0 \
libglusterfs0 \
libreadline.so.8 \
libssl.so.3 \
libtirpc.so.3 \
liburcu-bp.so.8 \
liburing.so.2 \
libuuid.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
