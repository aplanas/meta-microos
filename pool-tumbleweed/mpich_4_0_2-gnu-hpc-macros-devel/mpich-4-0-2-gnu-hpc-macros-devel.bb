SUMMARY = "HPC Macros for MPICH version 4.0.2"
DESCRIPTION = "HPC Macros for building RPM packages for MPICH version 4.0.2."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich_4_0_2-gnu-hpc-macros-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "9e33a0495666092891d92e1fd98a5480638508acabc7efe0aa25ec517ef95effb1232a6eebb99bc865b7a81d4066a253b33bc6ccef3fb5105a977134ba5c2156"

RPROVIDES:${PN} += "config-mpich-4-0-2-gnu-hpc-macros-devel \
mpich-4-0-2-gnu-hpc-macros-devel \
mpich-hpc-macros-devel \
rpm-macro-hpc-mpich-init \
rpm-macro-hpc-mpich-requires \
rpm-macro-hpc-mpich-requires-devel \
rpm-macro-hpc-setup-mpich"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-devel"

inherit rpm
