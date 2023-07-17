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

RPM_NAME = "openafs-client-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "9b9bdb598023771382350302dce02af7e55566bdd57525e9f6898eb144c8ffb3c33b6e1fa74786737a89bd28a4a2151d3efa52747550e11e842c2586b0fdcb44"

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
