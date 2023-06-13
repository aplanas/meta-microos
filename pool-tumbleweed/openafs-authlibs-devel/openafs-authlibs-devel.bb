SUMMARY = "OpenAFS shared library development"
DESCRIPTION = "The AFS distributed filesystem.  AFS is a distributed filesystem \
allowing cross-platform sharing of files among multiple computers. \
Facilities are provided for access control, authentication, backup and \
administrative management. \
 \
This package includes the static versions of libafsrpc and \
libafsauthent, and symlinks required for building against the dynamic \
libraries."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-authlibs-devel-1.8.9-4.1.aarch64.rpm"
RPM_HASH = "89d1ef335ae7bd857234fe57827c5a4d03e0b5eb4cdbc1e7d8b04d4b76743eade9fede2e6babee1a59442df126317fe1b9f8fe051e3ed92656356f4a5768169e"

RPROVIDES:${PN} += "openafs-authlibs-devel \
openafs-authlibs-devel(aarch-64)"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
