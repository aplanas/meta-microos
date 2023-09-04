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

RPM_NAME = "openafs-authlibs-devel-1.8.10-1.7.aarch64.rpm"
RPM_HASH = "5e8ebd032c750aedcb6962506464c64facf1f1460f8d624fd32d1b19dc1503e8669ff757c73e2950a1a83e98633a4e0d9538aa009a3a9e644d0c1c65c7f7f9f4"

RPROVIDES:${PN} += "openafs-authlibs-devel"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
