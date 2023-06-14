SUMMARY = "Test suite for the uDAPL library"
DESCRIPTION = "Test suite to validate the uDAPL library APIs."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-utils-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "374f32ebfdc0667fd9d6d0a2f15ea23909ba3edf4f24a44f83a8e5e4e0226c9088de3f0e572e87d77abf896b97f6842532aa110c169f2f74286d405b415549a7"

RPROVIDES:${PN} += "dapl-utils"

RDEPENDS:${PN} += "dapl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdat2.so.2"

inherit rpm
