SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparcv9-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "6f96c394acbac4b84dcbc2f903699280ea83d4800bab83578c0d93b892649cd27d85b0b028b6369d045eb5145194f8c73074710c20922676c08f31a0357d945c"

RPROVIDES:${PN} += "cross-sparcv9-gcc7-icecream-backend cross-sparcv9-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
