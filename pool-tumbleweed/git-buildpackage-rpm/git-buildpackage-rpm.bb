SUMMARY = "Build RPM packages from git"
DESCRIPTION = "Set of tools from Debian that integrate the package build system with Git. \
This package contains the tools for building RPM packages."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-rpm-0.9.23-1.3.noarch.rpm"
RPM_HASH = "5a809aa8376761c33a9a66ddd22d82cb7ab82bdd81c48d5f82fe79d5de2c4809728ef2645823ad0cedff0081678ebfb5c5aa726512b99b3842d9f7fa391fa106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage-rpm"

RDEPENDS:${PN} += "/usr/bin/sh \
git-buildpackage-common \
python-abi \
python3-rpm \
rpm"

inherit rpm
