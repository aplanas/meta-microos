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

PV = "1.8.9"

RPM_NAME = "openafs-fuse_client-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "d2a78c6a77a47ec2aba2940d550a9358ac125d6907fb95eb4f31763d4bb8bfcb9ddefdde6f7a338bd6e699a6d05501f5f274a8e115f5553d5109b0972764c52d"

RPROVIDES:${PN} += "config(openafs-fuse_client) \
openafs-fuse_client \
openafs-fuse_client(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libafshcrypto.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
librokenafs.so.2()(64bit) \
openafs"

inherit rpm
