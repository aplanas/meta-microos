SUMMARY = "Macros for openMPI version 1.10.7"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 1.10.7."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-macros-devel-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "fabc55dc5e4a6d476b183cb5816658b958506bab343633373fd14f186fcb6f603d454d4ede0499899d724c64001be2afc9b7915a3562266c50cd3784f648f7f7"

RPROVIDES:${PN} += "config-openmpi1-macros-devel \
openmpi-macros-provider \
openmpi1-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi1-devel"

inherit rpm
