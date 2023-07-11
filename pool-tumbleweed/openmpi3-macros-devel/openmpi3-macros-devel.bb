SUMMARY = "Macros for openMPI version 3.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 3.1.6."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-macros-devel-3.1.6-7.4.aarch64.rpm"
RPM_HASH = "3e98e8d5286c6c1bfb60a46728afb2193f6efb1b54784da8480ea48ca682801a47cd41bf1a4208e4a8e8023cc9c3f21d2b3c23e2624a24c3c9bfaf74556c052b"

RPROVIDES:${PN} += "config-openmpi3-macros-devel \
openmpi-macros-provider \
openmpi3-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi3-devel"

inherit rpm
