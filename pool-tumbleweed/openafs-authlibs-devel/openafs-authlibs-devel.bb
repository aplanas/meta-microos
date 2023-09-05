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

RPM_NAME = "openafs-authlibs-devel-1.8.10-1.8.aarch64.rpm"
RPM_HASH = "2b0c1c9551190ce2991bd66fb50253cbac273cd865d4895b43181147b35a0747da11c3c46eba6ef27dfecf421b6674a5cbf1ce74befb4cfc6e00c25fad69035e"

RPROVIDES:${PN} += "openafs-authlibs-devel"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
