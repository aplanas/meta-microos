SUMMARY = "File System Clone Utilities"
DESCRIPTION = "A set of file system clone utilities, including \
ext2/3, reiserfs, reiser4, xfs, hfs+ file systems"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.23"

RPM_NAME = "partclone-0.3.23-1.5.aarch64.rpm"
RPM_HASH = "809c76bffbed76417a35b593cfeaca08142b3324463d1d22be4385cfecb69d4e65a27d6b58f587bdf8957a96deb4b8a9eb9a598f0edd42beb4331a9863d451e4"

RPROVIDES:${PN} += "partclone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcrypto.so.3 \
libext2fs.so.2 \
libfuse.so.2 \
libncursesw.so.6 \
libnilfs.so.0 \
libntfs-3g.so.89 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
