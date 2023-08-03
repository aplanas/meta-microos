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

RPM_NAME = "openafs-authlibs-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "b1899cbf822dd4a3465a37deab91b58b707eb106d2fbc2ba0034a14f4f215a9c6bfafff9898a2e8e26c6a8e0207e137de280fadb8b6c28708433d9212258086a"

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
