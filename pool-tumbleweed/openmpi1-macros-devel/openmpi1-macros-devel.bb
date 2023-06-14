SUMMARY = "Macros for openMPI version 1.10.7"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 1.10.7."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-macros-devel-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "5c9859e0133b9a4603fb95bd4ac5f12dbedc6315117ad572f8a0dea684e04402e26ff0cda6cb483e47001e126ea1c53fa9638e030a61ddba139da01aeed6bfcb"

RPROVIDES:${PN} += "config-openmpi1-macros-devel \
openmpi-macros-provider \
openmpi1-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi1-devel"

inherit rpm
