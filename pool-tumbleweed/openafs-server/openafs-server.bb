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

RPM_NAME = "openafs-server-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "b40cd85c2ff5568ca18acb62127828b163b0d02f71b5cbcdf227a26f4f2b69a3f8c44295539237a76c7b8e7038788de606667339c718aab1023f0e98725e9864"

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
