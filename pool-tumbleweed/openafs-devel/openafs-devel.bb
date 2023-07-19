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

RPM_NAME = "openafs-devel-1.8.10-1.2.aarch64.rpm"
RPM_HASH = "3da3dd5233b07b2f1df49c48b45f90355a548fc10b72fce2d3d4ad851cf265735d349a2f0d03d63b63261e01f085cda50dc3934651ebefc5dd96eb58159f3643"

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
