SUMMARY = "FUSE file system client for ext2/ext3/ext4 file systems"
DESCRIPTION = "fuse2fs is a FUSE file system client that supports reading and \
writing from devices or image files containing ext2, ext3, and \
ext4 file systems."
LICENSE = "MIT"

PV = "1.46.5"

RPM_NAME = "fuse2fs-1.46.5-4.2.aarch64.rpm"
RPM_HASH = "d760273011cb0aa2fd9d30f3548ed85afd16ccf9f9d76643100fd309778077bb242c952ace0c9f740a2f0c47752924290bc251b690e37e60955b846919810582"

RPROVIDES:${PN} += "fuse2fs fuse2fs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libext2fs.so.2()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
