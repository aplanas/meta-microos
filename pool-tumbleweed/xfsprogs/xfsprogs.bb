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

RPM_NAME = "xfsprogs-6.3.0-1.1.aarch64.rpm"
RPM_HASH = "5c42d499cb01b88a9c6225be440558b27958fdf57690c6eaee98cde5945240d841522d026a3eefd1e67cdb01517947ff516a1aca13e853e58f8a553559718e34"

RPROVIDES:${PN} += "xfsprogs \
xfsprogs(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libedit.so.0()(64bit) \
libinih.so.0()(64bit) \
liburcu.so.8()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
