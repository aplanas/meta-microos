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

RPM_NAME = "openafs-fuse_client-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "0c071e7de17e1136a1af5420b82db7a2a8b625dd2594120b1988c4be6641339cb29c5768e1b2df4172a7866cb47c677f709dae95eb0a4150b924cd739ee5efa3"

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
