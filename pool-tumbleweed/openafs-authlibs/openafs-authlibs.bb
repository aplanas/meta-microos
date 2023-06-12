SUMMARY = "OpenAFS authentication shared libraries"
DESCRIPTION = "The AFS distributed filesystem.  AFS is a distributed filesystem \
allowing cross-platform sharing of files among multiple computers. \
Facilities are provided for access control, authentication, backup and \
administrative management. \
 \
This package provides a shared version of libafsrpc and libafsauthent. \
None of the programs included with OpenAFS currently use these shared \
libraries; however, third-party software that wishes to perform AFS \
authentication may link against them."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-authlibs-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "8e233a9a1a69bbd973bebd1cc11c744732627b942e78d353a28f8784243c759e1a369bd30133b110eacb3bda43940fdd98f42537b0b6919a5e4464fb5af09030"

RPROVIDES:${PN} += "libafsauthent.so.2()(64bit) \
libafsrpc.so.2()(64bit) \
libkopenafs.so.2()(64bit) \
openafs-authlibs \
openafs-authlibs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libafshcrypto.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
librokenafs.so.2()(64bit)"

inherit rpm