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

RPM_NAME = "openafs-kernel-source-1.8.10-1.8.noarch.rpm"
RPM_HASH = "f958b8d3d3031ac3a1e031737a5ec436e84792f9465fb454ba757e2f8efd93c38009cc45bae075c78608b8d887e4d354562ae301d520dc46552b1b950b4dae3b"
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
