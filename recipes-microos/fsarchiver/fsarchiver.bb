SUMMARY = "Filesystem Archiver"
DESCRIPTION = "FSArchiver is a system tool that allows you to save the contents of \
a file-system to a compressed archive file. The file-system can be \
restored on a partition which has a different size and it can be \
restored on a different file-system. Unlike tar/dar, FSArchiver also \
creates the file-system when it extracts the data to partitions. \
Everything is checksummed in the archive in order to protect the data. \
If the archive is corrupt, you just loose the current file, not \
the whole archive."
LICENSE = "GPL-2.0-only"

PV = "0.8.7"

RPM_NAME = "fsarchiver-0.8.7-1.1.aarch64.rpm"
RPM_HASH = "21399056fd3124033af2b4f98182ffa8ea1d59640e31c3c462cbbfef5eeba8bbacdbd349c0cf778218258e92b4df967f58235e67f41130e3ffd37851df00970d"

RPROVIDES:${PN} += "fsarchiver fsarchiver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libe2p.so.2()(64bit) libext2fs.so.2()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) liblz4.so.1()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) liblzo2.so.2()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
