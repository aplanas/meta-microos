SUMMARY = "Manual pages for cmake, a cross-platform make system"
DESCRIPTION = "Manual pages for cmake, a cross-platform make system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-man-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "65f43546be40f362bfce33f8b5c068ab0901956e22feb7cea22e29bc47a150b3cef3f38cea26df4edf2480635f13938f852fb89115bc00e540d60d6365ef04d2"

RPROVIDES:${PN} += "cmake-man \
cmake-man(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
