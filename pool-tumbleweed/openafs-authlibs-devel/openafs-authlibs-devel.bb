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

RPM_NAME = "openafs-authlibs-devel-1.8.10-1.2.aarch64.rpm"
RPM_HASH = "aae045e58a1d8220c08b6a8d83b51f49e40444496abfa77c4db5f94a0509dfd3a0f74d4ddf6ac42186cadc089046fd58619162e554f6cb889ee49c9f152d311e"

RPROVIDES:${PN} += "openafs-authlibs-devel"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
