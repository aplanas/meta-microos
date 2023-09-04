SUMMARY = "OpenAFS File System Client"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs. This package contains the OpenAFS client."
LICENSE = "IPL-1.0"

PV = "1.8.10"

RPM_NAME = "openafs-client-1.8.10-1.7.aarch64.rpm"
RPM_HASH = "c4337cfb701ff2876e2326db38014d32559a4f74e3623a099e05bcabe977e7be20419f2ac5ef6b05c238eea966f398c45cac4bef06a222a3eb479b8fea86cde3"

RPROVIDES:${PN} += "config-openafs-client \
openafs-client"

RDEPENDS:${PN} += "/usr/bin/sh \
krb5-client \
ld-linux-aarch64.so.1 \
libafshcrypto.so.2 \
libc.so.6 \
libk5crypto.so.3 \
libkrb5.so.3 \
librokenafs.so.2 \
openafs \
openafs-kmp"

inherit rpm
