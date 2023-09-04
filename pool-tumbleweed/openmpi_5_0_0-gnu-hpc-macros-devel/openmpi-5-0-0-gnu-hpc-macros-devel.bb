SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-macros-devel-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "2a456b829438d988ced3aceb9d3894961004ca9cd826d3c9d08b79a517d72ec6e8fced428d8c26dbe02718a36c0f31c88d5db43e50983c97aaa2e58ef41351a8"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
