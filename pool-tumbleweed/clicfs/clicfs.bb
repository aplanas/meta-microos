SUMMARY = "Compressed Loop Image Container"
DESCRIPTION = "Clic FS is a FUSE file system to mount a Compressed Loop Image \
Container. It has several features that make it a good choice for live \
systems. It will compress a Loop Image and export it as read write, \
creating a copy on write behaviour."
LICENSE = "GPL-2.0"

PV = "1.4.6"

RPM_NAME = "clicfs-1.4.6-7.28.aarch64.rpm"
RPM_HASH = "fc3975063c67aab62b6a064b1fbcdc2b6ec6fc3f5dfcd833b2616bfbc23c60b21bfdc1aaca89990ff46c53d376f5352bb6579cc2d7b4f2cf7008659d3602d076"

RPROVIDES:${PN} += "clicfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6"

inherit rpm
