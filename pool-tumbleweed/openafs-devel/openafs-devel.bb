SUMMARY = "OpenAFS Static Libraries and Header Files"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs. This package contains the OpenAFS server."
LICENSE = "IPL-1.0"

PV = "1.8.10"

RPM_NAME = "openafs-devel-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "b17ae9889b17329046a0f185c5c9a27db1fca0139be6e9c5dff89e602e557a80e70c35df5c7659df5c2f4c5ed2c9019dd01141bebbec68b622f864c2b7262cc1"

RPROVIDES:${PN} += "openafs-devel \
perl-AFS--ukernel \
perl-AFS--ukernelc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libafshcrypto.so.2 \
libc.so.6 \
librokenafs.so.2 \
openafs"

inherit rpm
