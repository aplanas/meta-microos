SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi1-hpc-devel-static-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "8d9838f4db431815a58a5a11a293279a18a18b84abd2fdc45cb9d190d90f65c54b303369589c5f8792b0b7ef56e1b55fe6aa0a50b3c2af322119b0037bd09f1b"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi1-hpc-devel-static \
ptscotch_6_1_0-gnu-openmpi1-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "ptscotch_6_1_0-gnu-openmpi1-hpc-devel"

inherit rpm
