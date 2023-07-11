SUMMARY = "HPC Macros for MPICH version 4.0.2"
DESCRIPTION = "HPC Macros for building RPM packages for MPICH version 4.0.2."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-macros-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "3327795fd88f7c316e006c89db6627c846267a645c570a1464d13fcd2c06623ce31f4a806f82066eafee136ca2ebb2f97665e1b9d96e5f22adb83b378512b6ed"

RPROVIDES:${PN} += "config-mpich-ofi-4-0-2-gnu-hpc-macros-devel \
mpich-hpc-macros-devel \
mpich-ofi-4-0-2-gnu-hpc-macros-devel \
rpm-macro-hpc-mpich-init \
rpm-macro-hpc-mpich-requires \
rpm-macro-hpc-mpich-requires-devel \
rpm-macro-hpc-setup-mpich"

RDEPENDS:${PN} += "mpich-ofi-4-0-2-gnu-hpc-devel"

inherit rpm
