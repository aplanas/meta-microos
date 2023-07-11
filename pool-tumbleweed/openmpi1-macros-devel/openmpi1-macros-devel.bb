SUMMARY = "Macros for openMPI version 1.10.7"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 1.10.7."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-macros-devel-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "95a86d80ace209ab7da695427f88ec0cc236c5ecaf475654fdba87ef2b70e61bea53879303c71f76a5ace9383a0de226033d0bdf3900cf7d23b1e1ae60958fe3"

RPROVIDES:${PN} += "config-openmpi1-macros-devel \
openmpi-macros-provider \
openmpi1-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi1-devel"

inherit rpm
