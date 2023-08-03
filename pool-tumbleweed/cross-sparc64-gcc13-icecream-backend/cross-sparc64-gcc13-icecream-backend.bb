SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-sparc64-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "9d781cd7eb588b2b3c9031d6b858d8e9acb9dccf95e33de15a8e9e09fa9830f95329373ae1f533b374a62a3146c52caf12ce0f5495c397418693475689564583"

RPROVIDES:${PN} += "cross-sparc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
