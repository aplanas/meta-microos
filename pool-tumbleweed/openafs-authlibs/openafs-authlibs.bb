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

RPM_NAME = "openafs-authlibs-1.8.9-4.6.aarch64.rpm"
RPM_HASH = "773902cc89e4c0ccfd55f57368955be991e474a5072c136f8aee3aaf5ad203513634d51ea2fb967fed9ece75aeadee4ccd44e813803f2ee0d5bc7404103e128c"

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
