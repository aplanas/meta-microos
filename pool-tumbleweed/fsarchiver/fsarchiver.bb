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

RPM_NAME = "fsarchiver-0.8.7-1.2.aarch64.rpm"
RPM_HASH = "55c04244e4f816a1b5291edfc452adf9b4365669bd1a03a0c3d71d75b463ff4689bde1444a68160ec01440978cdb2c05a14d05a1999f150dbf5ce4c897d8b0aa"

RPROVIDES:${PN} += "fsarchiver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libe2p.so.2 \
libext2fs.so.2 \
libgcrypt.so.20 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
