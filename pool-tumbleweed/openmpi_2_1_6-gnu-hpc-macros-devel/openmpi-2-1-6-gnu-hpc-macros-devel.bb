SUMMARY = "Macros for openMPI version 2.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 2.1.6."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-macros-devel-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "ecc427f6735fc9319491e4b0f3041ea0c68d5d1556df8bd24a1d224a3b3860c9dafb991382f50f668a6806154c3a1c3c696372cda68c6a0245b9f963df4150e3"

RPROVIDES:${PN} += "config-openmpi-2-1-6-gnu-hpc-macros-devel \
openmpi-2-1-6-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
