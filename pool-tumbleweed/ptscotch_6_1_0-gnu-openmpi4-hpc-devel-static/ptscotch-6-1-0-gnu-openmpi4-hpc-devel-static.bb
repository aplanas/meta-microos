SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi4-hpc-devel-static-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "fccf5be994a17b6a4d3f0385f2e86b04cce0784e7b60abb4b35d4b9f17520f4390064d2dd8b5f63b68eabace4a4b493a95b22054efb16ad9b2617b69d9dc9068"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi4-hpc-devel-static \
ptscotch_6_1_0-gnu-openmpi4-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "ptscotch_6_1_0-gnu-openmpi4-hpc-devel"

inherit rpm
