SUMMARY = "Utilities for managing the XFS file system"
DESCRIPTION = "A set of commands to use the XFS file system, including mkfs.xfs. \
 \
XFS is a high performance journaling file system which originated on \
the SGI IRIX platform.	It is completely multithreaded. It can support \
large files and large file systems, extended attributes, and variable \
block sizes. It is extent based and makes extensive use of Btrees \
(directories, extents, and free space) to aid both performance and \
scalability. \
 \
Refer to the documentation at https://xfs.wiki.kernel.org/ for complete \
details.  This implementation is on-disk compatible with the IRIX \
version of XFS."
LICENSE = "GPL-2.0-or-later"

PV = "6.3.0"

RPM_NAME = "xfsprogs-6.3.0-1.2.aarch64.rpm"
RPM_HASH = "56f42e9b631ffef1d12fc4fe2d3b6fdf941a3ec6390d8fc5072225a2d1e24041f1604a66447f0b0ef31a290a0b2c063466b9d0ee898a047ce918a6a2355a8f44"

RPROVIDES:${PN} += "xfsprogs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libedit.so.0 \
libinih.so.0 \
liburcu.so.8 \
libuuid.so.1"

inherit rpm
