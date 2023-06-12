SUMMARY = "Build packages from git"
DESCRIPTION = "Set of tools from Debian that integrate the package build system with Git. \
This package contains the original Debian tools."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-0.9.23-1.2.noarch.rpm"
RPM_HASH = "9de45c29c43e0bc073c061f6723ebc0a479ab184dc8b32714ca6dd4831f7bf61d20b7bfbb8b1364739f7c1647e3ab4b9df8b3a3d9f3d4ce9851b4aafcef3d956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage"
RDEPENDS:${PN} += "/bin/bash \
devscripts \
dpkg \
git-buildpackage-common \
python(abi)"

inherit rpm
