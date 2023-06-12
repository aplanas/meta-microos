SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230527"

RPM_NAME = "build-initvm-aarch64-20230527-1.1.noarch.rpm"
RPM_HASH = "dd794cb6403153d33301c95a51b03928c7a17b6e1630e37fdc4c67d3649ebeb9d24d6ed3c83125a165cd16f465bc276e3f662e6efde922e1c233528d710f3468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm build-initvm-aarch64"
RDEPENDS:${PN} += "build"

inherit rpm
