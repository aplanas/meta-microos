SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-parmetis-openmpi4-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "8b1d7e2334e85177470cf16b6138fd5b88876a3fd0f23f2904e6cac5eba715354f9312007c6db9656579a5953a190faec96dbd88996a15002fe72cd461eae499"

RPROVIDES:${PN} += "ptscotch-parmetis-openmpi4-devel"

RDEPENDS:${PN} += "libptscotch0-openmpi4 \
ptscotch-openmpi4-devel"

inherit rpm
