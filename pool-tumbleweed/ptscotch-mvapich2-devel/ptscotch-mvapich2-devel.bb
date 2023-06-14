SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-devel-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "0fe33f3b8270d6d5067bc51efbf7431bf803a50ef851922f2cbbdc4eea4baa7fb3d77d910045c21d01079b2e2e25f99d75e0ae52b00f6276faeab7ca563ad367"

RPROVIDES:${PN} += "ptscotch-mvapich2-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-mvapich2 \
mvapich2-devel \
scotch-devel"

inherit rpm
