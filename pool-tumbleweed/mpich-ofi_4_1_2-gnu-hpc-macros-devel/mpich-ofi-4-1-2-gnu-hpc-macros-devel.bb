SUMMARY = "HPC Macros for MPICH version 4.1.2"
DESCRIPTION = "HPC Macros for building RPM packages for MPICH version 4.1.2."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi_4_1_2-gnu-hpc-macros-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "d405c1b4e0794dfd5d80a4efd4944446e7fa091a3fc82478a479f57196f365158939d3c20e465c3c60a196927975bb392cd5f28be130f397253b85936cdcb302"

RPROVIDES:${PN} += "config-mpich-ofi-4-1-2-gnu-hpc-macros-devel \
mpich-hpc-macros-devel \
mpich-ofi-4-1-2-gnu-hpc-macros-devel \
rpm-macro-hpc-mpich-init \
rpm-macro-hpc-mpich-requires \
rpm-macro-hpc-mpich-requires-devel \
rpm-macro-hpc-setup-mpich"

RDEPENDS:${PN} += "mpich-ofi-4-1-2-gnu-hpc-devel"

inherit rpm
