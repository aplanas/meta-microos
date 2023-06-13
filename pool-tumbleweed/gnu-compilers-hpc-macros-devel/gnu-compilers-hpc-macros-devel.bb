SUMMARY = "Macro package for HPC GNU compiler environment"
DESCRIPTION = "Provides macros for building HPC compliant RPM with the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-macros-devel-1.4-10.2.noarch.rpm"
RPM_HASH = "3297f63639a8f37810ba06f830304b5423199bd3aac0f090695abd1379dd5967db5ff5c8750f475f413e380d72c042a849b66ece651f5db68469491a094017ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gnu-compilers-hpc-macros-devel) \
gnu-compilers-hpc-macros-devel \
gnu-hpc-macros-devel \
gnu13-compilers-hpc-macros-devel \
rpm_macro(hpc_gnu_init) \
rpm_macro(hpc_gnu_requires) \
rpm_macro(hpc_gnu_requires_devel) \
rpm_macro(hpc_setup_gnu)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel"

inherit rpm
