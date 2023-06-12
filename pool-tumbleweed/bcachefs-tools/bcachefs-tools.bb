SUMMARY = "Configuration utilities for bcachefs"
DESCRIPTION = "Bcachefs is a filesystem for Linux, with an emphasis on reliability \
and robustness. \
 \
* Copy on write (COW) - like zfs or btrfs \
* Full data and metadata checksumming \
* Multiple devices \
* Replication \
* Erasure coding \
* Caching \
* Compression \
* Encryption \
* Snapshots \
 \
This package contains utilities for creating and mounting bcachefs."
LICENSE = "GPL-2.0-or-later"

PV = "24"

RPM_NAME = "bcachefs-tools-24-1.1.aarch64.rpm"
RPM_HASH = "bc692d205bc34d2efa63d810820ef91d559980adb69f95b400f9893127bf5c48ead31715ac7483281e7d60fd2d50f6011d84ca53ad114d033b30d6e9a66ae063"

RPROVIDES:${PN} += "bcachefs-tools \
bcachefs-tools(aarch-64) \
libbcachefs.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libblkid.so.1(BLKID_2.21)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
liblz4.so.1()(64bit) \
libsodium.so.23()(64bit) \
liburcu-common.so.8()(64bit) \
liburcu.so.8()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
