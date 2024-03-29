SUMMARY = "Utilities for the Second Extended File System"
DESCRIPTION = "Utilities needed to create and maintain ext2 and ext3 file systems \
under Linux. Included in this package are: chattr, lsattr, mke2fs, \
mklost+found, tune2fs, e2fsck, resize2fs, and badblocks."
LICENSE = "GPL-2.0-only"

PV = "1.47.0"

RPM_NAME = "e2fsprogs-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "7114fe253642c724f160a277828975bbf273ec1388643c5bfa74437c2d5ba6f6fbb664713f478ce2b971187d6a0443207fa7cbb3e65a2fe26b6b821c95815417"

RPROVIDES:${PN} += "config-e2fsprogs \
e2fsprogs"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcom-err2 \
libe2p.so.2 \
libext2fs.so.2 \
libext2fs2 \
libss.so.2 \
libuuid.so.1"

inherit rpm
