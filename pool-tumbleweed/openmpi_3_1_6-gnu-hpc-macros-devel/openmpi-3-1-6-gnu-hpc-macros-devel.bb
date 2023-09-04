SUMMARY = "Macros for openMPI version 3.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 3.1.6."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-macros-devel-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "01a26dd656c33883ee07586649fe8f5009097be0efd3105d44395240bd1dbc9278ff2da4849a1e5f4f3c86859ba28d66356174496edc7cd1284559cbea7124e8"

RPROVIDES:${PN} += "config-openmpi-3-1-6-gnu-hpc-macros-devel \
openmpi-3-1-6-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-3-1-6-gnu-hpc-devel"

inherit rpm
