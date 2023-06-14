SUMMARY = "Macros for openMPI version 3.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 3.1.6."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-macros-devel-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "14a3c70bd51b4011785c25e09566c02d4d4063018a67159f05044f30d4869bd9d180859725e20ddf94c68ce7683c6403a1a7bde5d575082931a9a3d915a21af7"

RPROVIDES:${PN} += "config-openmpi-3-1-6-gnu-hpc-macros-devel \
openmpi-3-1-6-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
