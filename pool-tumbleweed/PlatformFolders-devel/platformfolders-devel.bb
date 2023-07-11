SUMMARY = "Library for cross-platform detection of special directories (development files)"
DESCRIPTION = "C++ library to look for directories like My Documents, \
~/.config, etc. so that you do not need to write \
platform-specific code. \
 \
These are Development files for the PlatformFolders library."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "PlatformFolders-devel-4.2.0-1.4.aarch64.rpm"
RPM_HASH = "71d46f31d436a682c7fdb8ca3653fc8004bcae98e91d4a2f76cb97cc4a3c71b448ec8bc13c70794e1e8aac725b512d462c0e31bbc56c3c3d5359db8065ec9f30"

RPROVIDES:${PN} += "PlatformFolders-devel \
cmake-platform-folders"

RDEPENDS:${PN} += "PlatformFolders"

inherit rpm
