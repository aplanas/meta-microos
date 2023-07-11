SUMMARY = "Macros for openMPI version 1.10.7"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 1.10.7."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-macros-devel-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "2689e68c6b1b54036db3438e58ac1ad3a5ddb89040b10c7d843ccc0ca11f002934a67e60cd5eebeff308a12fc9ef08358b43560e636bc7732793da1455c7cc51"

RPROVIDES:${PN} += "config-openmpi-1-10-7-gnu-hpc-macros-devel \
openmpi-1-10-7-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

inherit rpm
