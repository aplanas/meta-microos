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
libbcachefs.so"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libkeyutils.so.1 \
liblz4.so.1 \
libsodium.so.23 \
liburcu-common.so.8 \
liburcu.so.8 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
