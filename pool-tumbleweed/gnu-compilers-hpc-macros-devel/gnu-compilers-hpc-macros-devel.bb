SUMMARY = "Macro package for HPC GNU compiler environment"
DESCRIPTION = "Provides macros for building HPC compliant RPM with the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-macros-devel-1.4-13.1.noarch.rpm"
RPM_HASH = "111c6cb9f102488a4c6880a6225ef33a63e09726e267baa461716615720143569d1ff3c972bbdfdc753d71a593b922912e1c915225d945a315bd93040aba4eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gnu-compilers-hpc-macros-devel \
gnu-compilers-hpc-macros-devel \
gnu-hpc-macros-devel \
gnu13-compilers-hpc-macros-devel \
rpm-macro-hpc-gnu-init \
rpm-macro-hpc-gnu-requires \
rpm-macro-hpc-gnu-requires-devel \
rpm-macro-hpc-setup-gnu"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel"

inherit rpm
