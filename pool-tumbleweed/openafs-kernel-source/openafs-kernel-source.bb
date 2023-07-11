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

RPM_NAME = "openafs-kernel-source-1.8.9-4.6.noarch.rpm"
RPM_HASH = "99ecb368e3c9ddc6fde735e6da64f6fd587b57e1fe3085965918a925749876460c10b89db127f586f3f15cbc9af7641301a25fdb5423a25732f88211ad2bd503"
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
