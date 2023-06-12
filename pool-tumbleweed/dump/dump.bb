SUMMARY = "Programs for backing up and restoring ext2/3/4 filesystems"
DESCRIPTION = "The dump package contains both dump and restore.  Dump examines files \
in a file system, determines which ones need to be backed up, and \
copies those files to a specified disk, tape, or other storage medium. \
The restore command performs the inverse function of dump. It can \
restore a full backup of a file system."
LICENSE = "BSD-3-Clause"

PV = "0.4b47"

RPM_NAME = "dump-0.4b47-1.9.aarch64.rpm"
RPM_HASH = "f052b26a47304deb8c026cbc386a82ec8b38047a7f7b502be92ad0d6056b3a02dca5fa4f6153f9b86fabca91ab516d9ed35c0e69893891875cfacba0e909505d"

RPROVIDES:${PN} += "dump \
dump(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libe2p.so.2()(64bit) \
libext2fs.so.2()(64bit) \
liblzo2.so.2()(64bit) \
libreadline.so.8()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
