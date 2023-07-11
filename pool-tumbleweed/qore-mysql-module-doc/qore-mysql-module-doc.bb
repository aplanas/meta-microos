SUMMARY = "MySQL DBI module for Qore"
DESCRIPTION = "MySQL module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "qore-mysql-module-doc-2.1-1.6.aarch64.rpm"
RPM_HASH = "ea9a467d2c79b4757ea96c6475258378c5a84dfa91ea324baa4878f9296ef327266ab49494dd9c17e5b9029b8ef12cacd05aab6a021bc44ee1d0d4d363eb2f00"

RPROVIDES:${PN} += "qore-mysql-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
