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

RPM_NAME = "openafs-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "0b1532bca9d07879628ed5aa8e2aec41ec85ca309f9cf4bf02d8b630ede4755136e80a619defc92346d525ac57504e5c8060c69cf1949d021df946567e3aeedb"

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
