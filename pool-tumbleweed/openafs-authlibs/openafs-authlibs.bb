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

PV = "1.8.10"

RPM_NAME = "openafs-authlibs-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "b1f1264901338d25028c652586fcd9ad7a7c9c0bf39f5196efb8865299c5a54a03b70130a60fb2cfb7210f9738cb6d568cb46fccad8692a94627d7682d0a1f4b"

RPROVIDES:${PN} += "libafsauthent.so.2 \
libafsrpc.so.2 \
libkopenafs.so.2 \
openafs-authlibs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libafshcrypto.so.2 \
libc.so.6 \
libcrypt.so.1 \
librokenafs.so.2"

inherit rpm
