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

PV = "1.8.9"

RPM_NAME = "openafs-devel-1.8.9-4.6.aarch64.rpm"
RPM_HASH = "430ee4ccf6115281a40facc06b6d7d4611408eea11b12d20438cb6d3a558ca4a7974503171198c39522f9cefc48112879c98bb34700361cfdb4203a5e74efa2a"

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
