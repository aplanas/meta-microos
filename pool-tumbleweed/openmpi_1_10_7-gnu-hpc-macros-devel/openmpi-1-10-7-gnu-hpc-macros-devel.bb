SUMMARY = "Macros for openMPI version 1.10.7"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 1.10.7."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-macros-devel-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "e2791b0a4133da5fbaf5ea8c87b85b22b52bb818977d61a9e3c45c579f4ef6890c9cf6e17d0630299c668ecac078fa4b7a02f73116eb9b037bdf95bb79792dbe"

RPROVIDES:${PN} += "config(openmpi_1_10_7-gnu-hpc-macros-devel) \
openmpi-macros-provider \
openmpi_1_10_7-gnu-hpc-macros-devel \
openmpi_1_10_7-gnu-hpc-macros-devel(aarch-64) \
rpm_macro(hpc_openmpi_init) \
rpm_macro(hpc_openmpi_requires) \
rpm_macro(hpc_openmpi_requires_devel) \
rpm_macro(hpc_setup_openmpi)"

RDEPENDS:${PN} += "openmpi_1_10_7-gnu-hpc-devel"

inherit rpm
