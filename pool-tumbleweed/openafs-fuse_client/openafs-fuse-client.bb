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

RPM_NAME = "openafs-fuse_client-1.8.10-1.7.aarch64.rpm"
RPM_HASH = "ecc30b25f8c0dc3e14b6a2dfc014d098193af4db27edc6353dccb6e77180348143bc035db7b3c64611edbfd3b95904d5d925a54574736cebbb77a4dfb94a8e50"

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
