SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi1-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "abe9a272d1ad41c250de3145ee1398921b6ec3cbf1c48882d47864eacf47534a0cb80cc1086913f3675678059be8bf662b7f5b48b4ec617b0fdf11e4a8ade114"

RPROVIDES:${PN} += "ptscotch-openmpi1-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-openmpi1-devel"

inherit rpm
