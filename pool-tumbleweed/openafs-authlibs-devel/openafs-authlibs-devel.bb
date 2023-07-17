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

PV = "1.8.10"

RPM_NAME = "openafs-authlibs-devel-1.8.10-1.1.aarch64.rpm"
RPM_HASH = "885f028d931392aa229dcf5fecfb6faf4c50a539063b7ba466e01036da7fdfa2561b036f75744b3d846e4d8dc1851092a9d27e17f039811907f6be99b44ed7fc"

RPROVIDES:${PN} += "openafs-authlibs-devel"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
