SUMMARY = "OpenAFS Kernel Module source tree"
DESCRIPTION = "The AFS distributed filesystem.  AFS is a distributed filesystem \
allowing cross-platform sharing of files among multiple computers. \
Facilities are provided for access control, authentication, backup and \
administrative management. \
 \
This package provides the source code to build your own AFS kernel \
module."
LICENSE = "IPL-1.0"

PV = "1.8.10"

RPM_NAME = "openafs-kernel-source-1.8.10-1.4.noarch.rpm"
RPM_HASH = "712b9a4e0c9e4366f812f0c89a3205a2b18d12a9824c5b9609ec28678fdd64601097cdb455af4b3da2cea0c14c26048b79e9f26f65761bbe373448dc7089afdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openafs-kernel \
openafs-kernel-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bison \
flex \
gcc \
kernel-devel"

inherit rpm
