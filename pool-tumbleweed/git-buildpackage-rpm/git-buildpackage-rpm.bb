SUMMARY = "Build RPM packages from git"
DESCRIPTION = "Set of tools from Debian that integrate the package build system with Git. \
This package contains the tools for building RPM packages."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-rpm-0.9.23-1.2.noarch.rpm"
RPM_HASH = "331287ca9909441b876b80f71b106b56c975c9b43e2ea4d8e0694e4c990feeca50d2a70297200d5c960d827649a7e1875fd442d22bac71562a5239e5c45fb070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage-rpm"

RDEPENDS:${PN} += "/bin/sh \
git-buildpackage-common \
python-abi \
python3-rpm \
rpm"

inherit rpm
