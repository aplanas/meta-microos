SUMMARY = "OpenAFS Distributed File System"
DESCRIPTION = "AFS is a cross-platform distributed file system product pioneered at \
Carnegie Mellon University and supported and developed as a product by \
Transarc Corporation (now IBM Pittsburgh Labs). It offers a \
client-server architecture for file sharing, providing location \
independence, scalability, and transparent migration capabilities for \
data. \
 \
In addition, among its features are authentication, encryption, \
caching, disconnected operations, replication for higher availability \
and load balancing, and ACLs."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "11b7d933a92e3dfa5549ac94bf06a48d5a9ce448db7afbd63e6e3714be19c17d5cc97325c2fa5795d532b550ff342f271539e8d9b261d6729fde702e28077d84"

RPROVIDES:${PN} += "config(openafs) \
libafshcrypto.so.2()(64bit) \
librokenafs.so.2()(64bit) \
openafs \
openafs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libncurses.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
