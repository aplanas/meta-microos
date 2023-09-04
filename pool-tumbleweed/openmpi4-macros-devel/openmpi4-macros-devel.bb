SUMMARY = "Macros for openMPI version 4.1.5"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.5."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-macros-devel-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "6676e64902632a6cdb54839ab31827985f17fc470f318b95a851e1dad2589f02da2b59c39b0cde59c084e967f6b6d3e730b8a5b95343af4dd22bea746e6a7871"

RPROVIDES:${PN} += "openmpi-macros-devel \
openmpi-macros-provider \
openmpi4-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi4-devel"

inherit rpm
