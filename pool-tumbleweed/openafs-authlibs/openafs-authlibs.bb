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

RPM_NAME = "openafs-authlibs-1.8.10-1.2.aarch64.rpm"
RPM_HASH = "38da317a85a7c91d815d18c1cd22dc5eb7c3bed061ef5db48e8b64759ba6de3e44fb007f167dfe1461c005a31ffd2e7b7bdabe74d98e6e836455983d253f721d"

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
