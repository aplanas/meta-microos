SUMMARY = "Macros for openMPI version 3.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 3.1.6."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-macros-devel-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "31433589799fc8c013be6b8af41f6ff6c40b3438318fdf6cd8ad5cf7d337443c62b3b07475b538aabab9424ab375f8e03e9a080f4a822a03be5f8c46a6297cec"

RPROVIDES:${PN} += "config-openmpi-3-1-6-gnu-hpc-macros-devel \
openmpi-3-1-6-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
