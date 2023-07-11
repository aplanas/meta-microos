SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-openmpi2-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "fe992a3939e9b6ee67f65b920a100721b5f65e7fdc2ebcaea4a31ea871f2b8c0081a0d85ccc0e1cda3caf946514caced9f11ee1793d80ef6f1b4885868f56ed6"

RPROVIDES:${PN} += "ptscotch-openmpi2-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-openmpi2 \
openmpi2-devel \
scotch-devel"

inherit rpm
