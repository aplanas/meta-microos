SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-macros-devel-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "fa00a40f3ff0d968fb9c8215be10060f9b99e08b3c1831582fb0980bc9dca0d78224b02b12653d3e0f9cba085906d213771944531bed0b21f40ce2779ea1127d"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
