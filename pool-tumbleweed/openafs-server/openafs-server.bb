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

RPM_NAME = "openafs-server-1.8.10-1.7.aarch64.rpm"
RPM_HASH = "a066fda9999d4e288860166e075e43ca18a72809db6afa3b87bb3e90cdc2d3b3af98ecdbae52cf97e5846e26705506368e1f11898c7d02006cdf5d3c4c296544"

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
