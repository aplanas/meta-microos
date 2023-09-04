SUMMARY = "Macros for openMPI version 3.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 3.1.6."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-macros-devel-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "989b67a7913602d4d07b616e58be9f9c7d3eed8a0dd75ad69bc00bd19eeab007aa84d09d359ab63aff9b34056df66d50b8a4f31842e7908246ff8bd8d1df7b7d"

RPROVIDES:${PN} += "config-openmpi3-macros-devel \
openmpi-macros-provider \
openmpi3-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi3-devel"

inherit rpm
