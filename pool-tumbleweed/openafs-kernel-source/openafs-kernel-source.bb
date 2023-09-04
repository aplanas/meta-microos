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

RPM_NAME = "openafs-kernel-source-1.8.10-1.7.noarch.rpm"
RPM_HASH = "52dd59dc4f9a5dbea9aa1262ac69e7ef9693d9d96d9fc825800a27beed56efa291cdf73406f91b269f5c02cda076e89bbee8234a615e7d68b5457ce55b4acf10"
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
