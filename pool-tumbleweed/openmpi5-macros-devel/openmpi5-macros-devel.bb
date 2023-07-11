SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-macros-devel-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "bc94a113fd0c1c775d4e0fd9d0e47611bf3ec68f04f04c843c82e898e367705768eee5518898d7cd4a430a9bd41d9d3058c42ac5cb89f1c5e45d4a7419dfd736"

RPROVIDES:${PN} += "openmpi-macros-provider \
openmpi5-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi5-devel"

inherit rpm
