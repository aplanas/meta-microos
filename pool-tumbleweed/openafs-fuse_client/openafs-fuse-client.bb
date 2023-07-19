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

RPM_NAME = "openafs-fuse_client-1.8.10-1.2.aarch64.rpm"
RPM_HASH = "d96adeb8784903e6ee35a4924551e420d8f194ff77f5b0f4e1729d4a10571ac7281590978a62402469c6ff011056edff4a5da9cb72072c19d5d2aad8fed0a28e"

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
