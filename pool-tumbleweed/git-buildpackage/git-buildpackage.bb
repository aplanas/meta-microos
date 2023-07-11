SUMMARY = "Build packages from git"
DESCRIPTION = "Set of tools from Debian that integrate the package build system with Git. \
This package contains the original Debian tools."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-0.9.23-1.3.noarch.rpm"
RPM_HASH = "f46c3cf5ec311979a49049695668359bac253747323508b19fc1d5ef23682eb3f340127a3d4068321679a61abf660317f6fe639dc70ea67d82d85ed0580c1434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage"

RDEPENDS:${PN} += "/usr/bin/bash \
devscripts \
dpkg \
git-buildpackage-common \
python-abi"

inherit rpm
