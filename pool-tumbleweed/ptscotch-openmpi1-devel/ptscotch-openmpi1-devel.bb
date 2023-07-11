SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi1-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "9a0ebf4fb3e150f5bffb20aba4e58904d3e14e3ff219ae937be0bca70414e10ea4fd5bc51e2fec0a474d86aa6461d48a9cd553297c710a269a29f7306bbee46f"

RPROVIDES:${PN} += "ptscotch-openmpi1-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi1 \
openmpi1-devel \
scotch-devel"

inherit rpm
