SUMMARY = "OpenAFS File System Server"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs. This package contains the static \
libraries and header files needed to develop applications for OpenAFS."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-server-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "c4a93f0b96489ef92a93ff7baa46aad28aa8e2370e96ffc0b90e080f67b5d8208114dff197890d06a0684bd059714fa97dadc80967745c50592c47e8081aa3f5"

RPROVIDES:${PN} += "openafs-server"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libafshcrypto.so.2 \
libc.so.6 \
libcrypt.so.1 \
libkrb5.so.3 \
librokenafs.so.2 \
openafs"

inherit rpm
