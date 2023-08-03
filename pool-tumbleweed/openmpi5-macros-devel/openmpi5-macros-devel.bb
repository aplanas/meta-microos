SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-macros-devel-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "c7a18986b794bbce19e35702f28c2d837b0c570137d09e0cbfb0179b19d0e3a25b1f5152f82091563697486a54bd1636d5f7671594045ad755db5b285ecda693"

RPROVIDES:${PN} += "openmpi-macros-provider \
openmpi5-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi5-devel"

inherit rpm
