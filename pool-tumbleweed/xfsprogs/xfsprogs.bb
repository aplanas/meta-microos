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

PV = "6.4.0"

RPM_NAME = "xfsprogs-6.4.0-1.1.aarch64.rpm"
RPM_HASH = "50355e4d273672f7c22b0d01d95b820af3f70c6f24e827832773544be10d4aa5c54d89351ea30429af9f556f386357aff9a73075b7d8d50fee9adc51088c5e03"

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
