SUMMARY = "File System Clone Utilities"
DESCRIPTION = "A set of file system clone utilities, including \
ext2/3, reiserfs, reiser4, xfs, hfs+ file systems"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.25"

RPM_NAME = "partclone-0.3.25-1.1.aarch64.rpm"
RPM_HASH = "f9c00f5756c0e32319184f032ea7487ebf234d58a0f0f9e9715143dfae53b320e9c90d702f4307ababd3d56aa0f06357a1d49320c1f9a0597d885517d5d2b8ee"

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
