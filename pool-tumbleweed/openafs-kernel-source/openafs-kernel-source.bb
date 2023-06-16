SUMMARY = "OpenAFS Kernel Module source tree"
DESCRIPTION = "The AFS distributed filesystem.  AFS is a distributed filesystem \
allowing cross-platform sharing of files among multiple computers. \
Facilities are provided for access control, authentication, backup and \
administrative management. \
 \
This package provides the source code to build your own AFS kernel \
module."
LICENSE = "IPL-1.0"

PV = "1.8.9"

RPM_NAME = "openafs-kernel-source-1.8.9-4.1.noarch.rpm"
RPM_HASH = "9f8c46b99ea8c8bb7a632e331dcb2138513f9be9bf09a2c9a9c41bb38cda958b171194593f962318a67366723106dfd6fabd23ce18e61b70d2caedfd9cdc96fd"
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
