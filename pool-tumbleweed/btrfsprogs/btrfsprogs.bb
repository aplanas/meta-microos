SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain btrfs file systems under Linux."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "btrfsprogs-6.3-1.1.aarch64.rpm"
RPM_HASH = "496d1d69d9dc3055a9af5103f1a4c6bf539c4531174711ed5b1f45f4afc32104623a56c60d94b1ca245f7722a9023b5898d0bbcae847904a27f8a8499b6f61f9"

RPROVIDES:${PN} += "btrfs-progs \
btrfs-progs(aarch64) \
btrfsprogs \
btrfsprogs(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
btrfsprogs-udev-rules \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libext2fs.so.2()(64bit) \
liblzo2.so.2()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
