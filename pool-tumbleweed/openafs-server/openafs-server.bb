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

PV = "1.8.10"

RPM_NAME = "openafs-server-1.8.10-1.2.aarch64.rpm"
RPM_HASH = "0898b140bba3491fa13ee5855c0a3698b76fd79fd1de238000376f074c5a65b9b6ef3fa2f7f89c4923d9695a3de52ec4f6fffd86e0c62b892785fdcbc900fd31"

RPROVIDES:${PN} += "openafs-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libafshcrypto.so.2 \
libc.so.6 \
libcrypt.so.1 \
libkrb5.so.3 \
librokenafs.so.2 \
openafs"

inherit rpm
