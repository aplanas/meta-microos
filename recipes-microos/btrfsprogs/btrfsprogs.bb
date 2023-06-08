SUMMARY = "Utilities for the Btrfs filesystem"
DESCRIPTION = "Utilities needed to create and maintain btrfs file systems under Linux."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "btrfsprogs-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "01add048de849f1fb7be58c4a0901a04e33063fde8f07a8bcec3f462ca55cf44f261ad9646eb7e5720dcade2fe6fea3f7cf457ad2b9d2c8f4703dfffbe623d96"

RPROVIDES:${PN} += "btrfs-progs btrfs-progs(aarch64) btrfsprogs btrfsprogs(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh btrfsprogs-udev-rules coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libext2fs.so.2()(64bit) liblzo2.so.2()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit)"

inherit rpm
