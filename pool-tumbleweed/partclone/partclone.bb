SUMMARY = "File System Clone Utilities"
DESCRIPTION = "A set of file system clone utilities, including \
ext2/3, reiserfs, reiser4, xfs, hfs+ file systems"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.23"

RPM_NAME = "partclone-0.3.23-1.4.aarch64.rpm"
RPM_HASH = "7a9a165b95b7e7d647bd4a69bdcf683d1533f4d2fd94efbbe8b977324c424f33de1821a852152d6ba7c1bfbc5ee7ea982dfbdef2884312e45baa36e36bb6e929"

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
