SUMMARY = "Macros for openMPI version 1.10.7"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 1.10.7."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-macros-devel-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "363bac299138d08ff366c700ae990b41ed7d0ed1e26b557b6d641b59285fbbab7c155bc910a967d8a57e0924720de5d67f01dc81e01c5e27200a1b44adac04dd"

RPROVIDES:${PN} += "config-openmpi-1-10-7-gnu-hpc-macros-devel \
openmpi-1-10-7-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
