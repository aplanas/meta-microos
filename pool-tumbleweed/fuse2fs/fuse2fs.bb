SUMMARY = "FUSE file system client for ext2/ext3/ext4 file systems"
DESCRIPTION = "fuse2fs is a FUSE file system client that supports reading and \
writing from devices or image files containing ext2, ext3, and \
ext4 file systems."
LICENSE = "MIT"

PV = "1.47.0"

RPM_NAME = "fuse2fs-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "c2dffd3fad3626a69179b6fa48a93a8ee042d83b126c8b7e0e46cc4ff0ff3192db9eaa1fc3db0c4de3d1952edc0e79d75be00e147f5f3834812a401e11b85397"

RPROVIDES:${PN} += "fuse2fs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
libfuse.so.2 \
libuuid.so.1"

inherit rpm
