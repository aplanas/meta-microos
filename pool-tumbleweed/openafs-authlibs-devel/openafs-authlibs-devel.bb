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

RPM_NAME = "openafs-authlibs-devel-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "be41434dfce8324f39e1db9128c7c0518b18ba6dedd9b843df92ce137f90cdcd1c7c6541d361d1d8af2908355231e8c759a2759bc7cabd0c0f13ef93dfada742"

RPROVIDES:${PN} += "openafs-authlibs-devel"

RDEPENDS:${PN} += "openafs-authlibs \
openafs-devel"

inherit rpm
