SUMMARY = "Macros for openMPI version 3.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 3.1.6."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-macros-devel-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "08a5291a30a659f0e25d65c5427a3cd38025d7efbca04e6a22741d41b7464c299b89a4d680a2a2c42508d2b245c74b5b91862867b95ae34ed1080a100fedbff7"

RPROVIDES:${PN} += "config-openmpi3-macros-devel \
openmpi-macros-provider \
openmpi3-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi3-devel"

inherit rpm
