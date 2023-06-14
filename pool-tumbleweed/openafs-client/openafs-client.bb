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

PV = "1.8.9"

RPM_NAME = "openafs-client-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "b522f09b8e53f2b7394242395c8f13b792d3c65dd9cfdbef46789f26bfaa78c09fe9de119aedd481c4dbb026f788201bbe4c68207039a894dd279c64fdf0b174"

RPROVIDES:${PN} += "config-openafs-client \
openafs-client"

RDEPENDS:${PN} += "/bin/sh \
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
