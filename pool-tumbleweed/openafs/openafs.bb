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

RPM_NAME = "openafs-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "8d43a09b87e60bfd3ea18f3f58a47fd5dee8ed225673a3d5adb202b3c2185d2189fe255d9b0226e6c6e5670831c068e18437ef7b897d3e611e479900e9729a85"

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
