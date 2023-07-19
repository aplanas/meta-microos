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

RPM_NAME = "openafs-kernel-source-1.8.10-1.2.noarch.rpm"
RPM_HASH = "ddb7dfe680946c40968d54ef5fee3730c7d73441442cdfd868bad24f2cf92e9d8716bba52b5a73e4358a0860ad5b293b4e35bbec4931cca831d27f05b8be4979"
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
