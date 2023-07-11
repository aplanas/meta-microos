SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi4-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "6906293a81943e70747d05e16519cd3dd57a0bd2645a26704631e46c902812849c37fe225f65c6c56eb4d01dffb40172e07f0d7c34ab54495af006808aee76e0"

RPROVIDES:${PN} += "ptscotch-openmpi4-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi4 \
openmpi4-devel \
scotch-devel"

inherit rpm
