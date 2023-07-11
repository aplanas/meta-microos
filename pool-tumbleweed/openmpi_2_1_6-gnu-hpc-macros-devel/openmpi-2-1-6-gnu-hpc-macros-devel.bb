SUMMARY = "Macros for openMPI version 2.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 2.1.6."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-macros-devel-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "633eff91a421460605523c27b3f8ec8715db12c7b85ce80c5e753b99baad39caf37ef791ec0b6fbce0ff913341ef2028178842c40f7cfeb31b952b912c7d5729"

RPROVIDES:${PN} += "config-openmpi-2-1-6-gnu-hpc-macros-devel \
openmpi-2-1-6-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
