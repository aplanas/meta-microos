SUMMARY = "HPC Macros for MPICH version 4.0.2"
DESCRIPTION = "HPC Macros for building RPM packages for MPICH version 4.0.2."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich_4_0_2-gnu-hpc-macros-devel-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "787ab39d5c73de4fc15c704f0693caf84b3afe5a76852df62da777f40705af6c7173875240600ee7464a9281840c03bedd8f7b098f38e91a6b6743f79a95b4f0"

RPROVIDES:${PN} += "config-mpich-4-0-2-gnu-hpc-macros-devel \
mpich-4-0-2-gnu-hpc-macros-devel \
mpich-hpc-macros-devel \
rpm-macro-hpc-mpich-init \
rpm-macro-hpc-mpich-requires \
rpm-macro-hpc-mpich-requires-devel \
rpm-macro-hpc-setup-mpich"

RDEPENDS:${PN} += "mpich-4-0-2-gnu-hpc-devel"

inherit rpm
