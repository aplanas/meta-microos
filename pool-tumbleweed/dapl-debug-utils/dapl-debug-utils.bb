SUMMARY = "Test suite for the uDAPL library"
DESCRIPTION = "Test suite to validate the uDAPL library APIs."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-utils-2.1.10-5.2.aarch64.rpm"
RPM_HASH = "f6b137d2fafe39d929f51f1505caeeed0da2aaed0c3548b30d0efd2a48385180009c16e78ff3253943290b2308d4b9e5e837d365cd381adec7a0088c3e73de7c"

RPROVIDES:${PN} += "dapl-debug-utils"

RDEPENDS:${PN} += "dapl-debug \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdat2.so.2"

inherit rpm
