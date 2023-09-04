SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230808"

RPM_NAME = "build-initvm-aarch64-20230808-1.1.noarch.rpm"
RPM_HASH = "c3913d486547da88e7a29300eac17e36f616e28c2afccf02fae1e2b0dc58408a7d40046a4ab9584575e962b5de667edbd7e924f6b7b446bfc08c04736e463932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm \
build-initvm-aarch64"

RDEPENDS:${PN} += "build"

inherit rpm
