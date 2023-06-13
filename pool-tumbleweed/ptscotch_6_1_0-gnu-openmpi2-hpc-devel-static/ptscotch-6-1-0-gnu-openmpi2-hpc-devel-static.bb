SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi2-hpc-devel-static-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "22a65fd4315eb5c8361ee909a4c2fd9de661b64f8e2c0be0f7129336c5a0463c2456285c3be12b51e171d3182afb48f262f218eb58bc35af9c0c9888d09211f9"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi2-hpc-devel-static \
ptscotch_6_1_0-gnu-openmpi2-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "ptscotch_6_1_0-gnu-openmpi2-hpc-devel"

inherit rpm
