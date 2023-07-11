SUMMARY = "Macros for openMPI version 2.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 2.1.6."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-macros-devel-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "8a1e93634c34638232639d958ad63d274af8d3c43b594e648dda5674b3c3fa1ebe41dee562c451b5a53c1580e85793a26816c3232a0c8d51b54a0144ff1a1550"

RPROVIDES:${PN} += "config-openmpi2-macros-devel \
openmpi-macros-provider \
openmpi2-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi2-devel"

inherit rpm
