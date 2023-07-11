SUMMARY = "Macros for openMPI version 4.1.4"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.4."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-macros-devel-4.1.4-2.4.aarch64.rpm"
RPM_HASH = "ccf7fbc5e27234acbda7a3cbaaa21e893b35f23ad4779e4bf8ffb68bad1c3577c92c9527920a48c52f689d342265110cad92527425dcfa118936c6b0f5999cbd"

RPROVIDES:${PN} += "openmpi-macros-devel \
openmpi-macros-provider \
openmpi4-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi4-devel"

inherit rpm
