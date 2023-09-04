SUMMARY = "Imlib 2 - plugin filters"
DESCRIPTION = "This package has the basic set of plugin filters that come with Imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "imlib2-filters-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "1511be3aef794b2019674c494b2a3e5fe92b21e3aefff69d6194c2bd16e3d2e4102faa8ffe569b5010ef17cc990150c03ae683ccb7f7a3c6a863709fb0b80f07"

RPROVIDES:${PN} += "imlib2-filters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2-1 \
libImlib2.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
