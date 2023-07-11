SUMMARY = "Test suite for the uDAPL library"
DESCRIPTION = "Test suite to validate the uDAPL library APIs."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-utils-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "58ca76667e63fd9434fac5f8b81838bb9c5d85ef381744ca0632b090fe9d09151e9d47c25e2a4db9aa4cdced0c84bb21e3e575fd80b6a2b722ab4e4a220c366d"

RPROVIDES:${PN} += "dapl-utils"

RDEPENDS:${PN} += "dapl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdat2.so.2"

inherit rpm
