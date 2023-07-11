SUMMARY = "Event library for device-mapper"
DESCRIPTION = "Device mapper event daemon shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper-event1_03-2.03.16_1.02.185-7.1.aarch64.rpm"
RPM_HASH = "281b2c3f8fe5baf8b12eba555b6c31b731ef78941c93d7b2c8fc8f8a32989a9044d4062057778a063857290307377769108710eaddac7ee0ae4c5b14d9fbb3f1"

RPROVIDES:${PN} += "libdevmapper-event.so.1.03 \
libdevmapper-event1-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
