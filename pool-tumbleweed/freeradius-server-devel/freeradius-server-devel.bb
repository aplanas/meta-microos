SUMMARY = "FreeRADIUS Development Files"
DESCRIPTION = "FreeRADIUS header files for development."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-devel-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "fe26f59e02f974abc4f9bad547d51a28a10c6b730d507ff9832164424b88af28ab6e7d190e000dbd0c57d0fe81836bb9c43b2cab94dcaaa7e005db079107ad26"

RPROVIDES:${PN} += "freeradius-server-devel \
freeradius-server-devel(aarch-64)"

RDEPENDS:${PN} += "freeradius-server-libs"

inherit rpm
