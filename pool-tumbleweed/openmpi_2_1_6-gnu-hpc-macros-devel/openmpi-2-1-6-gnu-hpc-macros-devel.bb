SUMMARY = "Macros for openMPI version 2.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 2.1.6."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-macros-devel-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "a3c81db55a14fa5299513940d7d5154a77df204b37da469b092ac84d0b5411e60f9c409a81700926a48b8261707e6f3ae2f14ece470ea498028a7e8f13f59161"

RPROVIDES:${PN} += "config-openmpi-2-1-6-gnu-hpc-macros-devel \
openmpi-2-1-6-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

inherit rpm
