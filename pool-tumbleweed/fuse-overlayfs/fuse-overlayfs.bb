SUMMARY = "FUSE implementation for overlayfs"
DESCRIPTION = "An implementation of overlay+shiftfs in FUSE for rootless containers."
LICENSE = "GPL-3.0-only"

PV = "1.10"

RPM_NAME = "fuse-overlayfs-1.10-1.2.aarch64.rpm"
RPM_HASH = "2511734d7094271043927e759077e01ed0c89bd7907addf192543218da5847a42855bcc3a59560bec0cf3f4d7e8cca7e7239095fe517a07c5821b71cbe632875"

RPROVIDES:${PN} += "fuse-overlayfs \
fuse-overlayfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse3.so.3()(64bit) \
libfuse3.so.3(FUSE_3.0)(64bit) \
libfuse3.so.3(FUSE_3.12)(64bit) \
libfuse3.so.3(FUSE_3.2)(64bit)"

inherit rpm
