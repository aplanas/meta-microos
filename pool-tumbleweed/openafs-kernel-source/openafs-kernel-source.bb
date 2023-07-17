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

RPM_NAME = "openafs-kernel-source-1.8.10-1.1.noarch.rpm"
RPM_HASH = "21c17417dbccb060fad5e5bc72b0a5dd81edcd45e2a8722b8498ae3561cc12b6e8d28ee6e2cb4a305580a529ebc1992a7a1a1a9f11e1f5c7b626518e1b08e7cb"
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
