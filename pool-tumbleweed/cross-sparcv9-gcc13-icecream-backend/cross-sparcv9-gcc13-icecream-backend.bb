SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "bc3b61d317ba4815f3ae0ed053b19023404efe514c9a73a11626134ed67d8ce0fd917a242e2f3712ca87d6c69cab2eb96595db9e07659df15d1bb0a274326d69"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
