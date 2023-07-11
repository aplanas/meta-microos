SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "gecode-devel-6.3.0~git20211208.6b09bea4-1.6.aarch64.rpm"
RPM_HASH = "4368ba919a656d2cb90e4ef956cdeb013e7613bbc5440f777e78109f2d7b9797ee548d2f47f46e7e862818ee24b8d0d96dd7c5842a5d26308d732d8c6ac1cdaa"

RPROVIDES:${PN} += "gecode-devel"

RDEPENDS:${PN} += "libgecode51"

inherit rpm
