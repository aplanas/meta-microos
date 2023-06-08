SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230502"

RPM_NAME = "build-initvm-aarch64-20230502-1.1.noarch.rpm"
RPM_HASH = "75b4ce41a733f3daa54e6d08a6e67d608964d5c88639db070d9ec539bf0e928d9e333e82fcc80a25dc96473b9d86d278d9fa785dc210ba20295a53a7e3600266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm build-initvm-aarch64"
RDEPENDS:${PN} += "build"

inherit rpm
