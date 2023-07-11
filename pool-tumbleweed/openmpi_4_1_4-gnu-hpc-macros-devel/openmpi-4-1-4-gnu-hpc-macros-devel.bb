SUMMARY = "Macros for openMPI version 4.1.4"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.4."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-macros-devel-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "72c383e2c2157fac0a8f50e2c36d5642caac90353a7b03c38e2fb8a5958bffbd3776b69121742d82c6cfd5b588622eba3bfea9cbca4602fd6b500289beb807d3"

RPROVIDES:${PN} += "openmpi-4-1-4-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-4-1-4-gnu-hpc-devel"

inherit rpm
