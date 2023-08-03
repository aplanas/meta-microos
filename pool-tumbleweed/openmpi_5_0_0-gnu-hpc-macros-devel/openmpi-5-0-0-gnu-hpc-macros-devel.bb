SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-macros-devel-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "0bad1970d237c3879633a7c22d9c1d3ee99902d6a93f32bac1d045b28128e4f10c1725ef31646ecc31d56ba6a2aa6f6f0c96dd88685c040bbec74cd9ddd6793a"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-macros-devel \
openmpi-macros-provider \
rpm-macro-hpc-openmpi-init \
rpm-macro-hpc-openmpi-requires \
rpm-macro-hpc-openmpi-requires-devel \
rpm-macro-hpc-setup-openmpi"

RDEPENDS:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

inherit rpm
