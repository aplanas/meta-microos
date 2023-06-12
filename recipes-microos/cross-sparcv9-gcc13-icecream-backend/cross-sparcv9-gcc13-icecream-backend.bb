SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "8a03d02cf5c91fb024705b8187f0150046eddd1ccc887a2e519c2873b5af605703b058b06c43b0d5cf1d7b8ae4af4f7f3c3e90bc62699e1f924a8874d6cae16d"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend \
cross-sparcv9-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
