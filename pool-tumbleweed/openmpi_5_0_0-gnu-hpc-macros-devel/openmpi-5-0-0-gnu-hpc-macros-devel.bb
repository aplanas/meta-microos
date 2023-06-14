SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-macros-devel-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "65ffe593af6c17d01487c0a59e6d0a12a8d06e2b7c8afa69079f53650f8c1f054ab29c82f094eaa084a59fe64d10a23c3067a82d10b32c84aedf4d5e57de19df"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
