SUMMARY = "OpenAFS Distributed File System"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs."
LICENSE = "IPL-1.0"

PV = "1.8.10"

RPM_NAME = "openafs-1.8.10-1.8.aarch64.rpm"
RPM_HASH = "617d8b2c0cb3931c42ebf91a885662b90354eac33ce78fde4dc677b002c061baac9eac5f862003508782f8dd5c115c9ade511e826a570d2db1fc5e9f56aecfc9"

RPROVIDES:${PN} += "config-openafs \
libafshcrypto.so.2 \
librokenafs.so.2 \
openafs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libkrb5.so.3 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
