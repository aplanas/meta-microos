SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains the devel libraries and header file in the case \
scotch is used as a replacement of the metis library."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch-metis-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "1a73eae010d94e87570f9205aabe8fc5b37b333a90cbcfa66602b8382f8f513c5c9fc251edc5110b419d112ba1f5407994480971c96c5eb2e6b985346136f40b"

RPROVIDES:${PN} += "scotch-metis-devel"

RDEPENDS:${PN} += "libscotch0 \
scotch-devel"

inherit rpm
