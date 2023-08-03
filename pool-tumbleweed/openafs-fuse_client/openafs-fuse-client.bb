SUMMARY = "OpenAFS FUSE File System Client"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
This client is using the EXPERIMENTAL FUSE interface on LINUX. \
It does not offer authentication etc."
LICENSE = "IPL-1.0"

PV = "1.8.10"

RPM_NAME = "openafs-fuse_client-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "5085daab5be8592bce6fd058885a43671ab5d98a5d703849fb8efc7a73d6bcb265c9d6e926e2a2e39f39942729b2e60822a88f7a38cd910ccba2f650ff81f6ad"

RPROVIDES:${PN} += "config-openafs-fuse-client \
openafs-fuse-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libafshcrypto.so.2 \
libc.so.6 \
libfuse.so.2 \
librokenafs.so.2 \
openafs"

inherit rpm
