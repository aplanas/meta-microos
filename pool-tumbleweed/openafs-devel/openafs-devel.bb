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

RPM_NAME = "openafs-devel-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "cd85d8a6a96beea80bb1933afe4b25cb93d931443c470d23090660a298472bc56e1afa8626097864fbb62e6d3d49e00c83647120f680874adb26eef664a1b28b"

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
