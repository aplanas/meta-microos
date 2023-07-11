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

RPM_NAME = "openafs-authlibs-devel-1.8.9-4.6.aarch64.rpm"
RPM_HASH = "766093720327f076c8bbdd9bdeb225eb15655851e4c85066b40530b584d3974f33cdf4add9047c864b72e99cc5f60484eb7935f3f64a6b842c0e0476b1eba5e2"

RPROVIDES:${PN} += "openafs-authlibs-devel"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
