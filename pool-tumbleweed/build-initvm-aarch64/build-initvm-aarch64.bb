SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230628"

RPM_NAME = "build-initvm-aarch64-20230628-1.1.noarch.rpm"
RPM_HASH = "f7b6c6dce524e19ad2a138f95c7e8d63c4f278273f145bf831f0294b464eff67302868e76d287a0b6fd9460a16fe4719f2f2248eeb82a5a1871c671f39b442a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm \
build-initvm-aarch64"

RDEPENDS:${PN} += "build"

inherit rpm
