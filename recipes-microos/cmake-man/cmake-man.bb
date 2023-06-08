SUMMARY = "Manual pages for cmake, a cross-platform make system"
DESCRIPTION = "Manual pages for cmake, a cross-platform make system."
LICENSE = "BSD-3-Clause"

PV = "3.26.3"

RPM_NAME = "cmake-man-3.26.3-3.1.aarch64.rpm"
RPM_HASH = "e0970a7d2036f4b1413d726837c23df7fb8609246dc49f8a83c52726f253f6c104fac8d09bea1baed6f827d643299df06e86147d3903f26a0d688b3db087c571"

RPROVIDES:${PN} += "cmake-man cmake-man(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
