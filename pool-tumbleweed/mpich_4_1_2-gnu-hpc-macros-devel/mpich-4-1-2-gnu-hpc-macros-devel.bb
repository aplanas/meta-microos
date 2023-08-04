SUMMARY = "HPC Macros for MPICH version 4.1.2"
DESCRIPTION = "HPC Macros for building RPM packages for MPICH version 4.1.2."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich_4_1_2-gnu-hpc-macros-devel-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "b9aea1208657394a542920af0a7beb39c0a46edf9a7285fdf117856392de09b8c013b68afa9e2d01d62487b228ed7b7b1c14bef259c06c5497ba888d6ff11ff2"

RPROVIDES:${PN} += "config-mpich-4-1-2-gnu-hpc-macros-devel \
mpich-4-1-2-gnu-hpc-macros-devel \
mpich-hpc-macros-devel \
rpm-macro-hpc-mpich-init \
rpm-macro-hpc-mpich-requires \
rpm-macro-hpc-mpich-requires-devel \
rpm-macro-hpc-setup-mpich"

RDEPENDS:${PN} += "mpich-4-1-2-gnu-hpc-devel"

inherit rpm
