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

RPM_NAME = "openafs-devel-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "e3aece7f1f24c66e9d819d4f609ba85c3e7587433a96e4f55fdc6ffad26346672e5e05e740ebda3c1bcd84f3d9e37a7b90ae786b751bd877eacde36ca3c55b2c"

RPROVIDES:${PN} += "openafs-devel \
openafs-devel(aarch-64) \
perl(AFS::ukernel) \
perl(AFS::ukernelc)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libafshcrypto.so.2()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
librokenafs.so.2()(64bit) \
openafs"

inherit rpm
