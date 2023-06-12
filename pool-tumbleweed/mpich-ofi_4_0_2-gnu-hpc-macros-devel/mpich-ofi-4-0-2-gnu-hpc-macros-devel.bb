SUMMARY = "HPC Macros for MPICH version 4.0.2"
DESCRIPTION = "HPC Macros for building RPM packages for MPICH version 4.0.2."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-macros-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "5181fa3a1c973000d57fd8030a5536e6b42620e8d1079b1ebf7033275255659fea8f8de3eb637de6b985057f1f27e2f6308c44ed93dcc9e07c6a1273e0754fa2"

RPROVIDES:${PN} += "config(mpich-ofi_4_0_2-gnu-hpc-macros-devel) \
mpich-hpc-macros-devel \
mpich-ofi_4_0_2-gnu-hpc-macros-devel \
mpich-ofi_4_0_2-gnu-hpc-macros-devel(aarch-64) \
rpm_macro(hpc_mpich_init) \
rpm_macro(hpc_mpich_requires) \
rpm_macro(hpc_mpich_requires_devel) \
rpm_macro(hpc_setup_mpich)"
RDEPENDS:${PN} += "mpich-ofi_4_0_2-gnu-hpc-devel"

inherit rpm
