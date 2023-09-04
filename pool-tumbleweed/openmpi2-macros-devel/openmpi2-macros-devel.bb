SUMMARY = "Macros for openMPI version 2.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 2.1.6."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-macros-devel-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "6c1fa3ce5a4cd4e0351cbc4ed8ae11e1f4694dcbf4e654106523839632c7777896da9e29afe42959f6a82b88c8d7becc6596221be324313da378fc49ea381b9b"

RPROVIDES:${PN} += "config-openmpi2-macros-devel \
openmpi-macros-provider \
openmpi2-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi2-devel"

inherit rpm
