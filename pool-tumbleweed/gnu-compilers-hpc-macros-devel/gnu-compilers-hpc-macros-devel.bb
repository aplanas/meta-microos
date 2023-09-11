SUMMARY = "Macro package for HPC GNU compiler environment"
DESCRIPTION = "Provides macros for building HPC compliant RPM with the GNU compiler toolchain."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "gnu-compilers-hpc-macros-devel-1.4-14.1.noarch.rpm"
RPM_HASH = "3e969031f22820ee05a45a0fe917cecdba22f28d75916722996ce7fe0b4a350e55287b2b19d8e83163a26fc0df14bc150d312d12128af222be80a59d5e85a7dc"
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
