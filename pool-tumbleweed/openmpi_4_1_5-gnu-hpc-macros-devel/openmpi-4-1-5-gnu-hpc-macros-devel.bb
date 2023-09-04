SUMMARY = "Macros for openMPI version 4.1.5"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.5."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi_4_1_5-gnu-hpc-macros-devel-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "9023c4e52ae7ffa61b51e11838c1cc5ef9d4f9480d053e45eaa660dcc052c80c1b3a97f454aea0f45bafdeb94175ac9d12a71392c0061775d29a1b484e08feb3"

RPROVIDES:${PN} += "openmpi-4-1-5-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-4-1-5-gnu-hpc-devel"

inherit rpm
