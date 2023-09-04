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

RPM_NAME = "openafs-devel-1.8.10-1.7.aarch64.rpm"
RPM_HASH = "6bee682deac112844e94d7cacac4dd7dcf3b369915ba4fe8c166389fd8100c94e2ad4689a97bcc877b95c3bccae5ffc2695f560cc02604254b5103def650452f"

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
