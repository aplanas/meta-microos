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

RPM_NAME = "openafs-server-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "33b9efac56f8c01e1259f92f1238f31d8f668656ac65d13b335cd40a62d303d651a7069d9ce75a96e5b76ff71f24d455c8693de65e7f9feb4a6e067de5798e58"

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
