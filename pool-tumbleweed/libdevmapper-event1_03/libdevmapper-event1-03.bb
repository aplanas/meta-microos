SUMMARY = "Event library for device-mapper"
DESCRIPTION = "Device mapper event daemon shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper-event1_03-2.03.16_1.02.185-8.1.aarch64.rpm"
RPM_HASH = "fe792f375649a4990282c1bb4e8876886f597137125deab3fc38ec56291d3e97050de50245079fc9510f4c350cedaafb5220909e83b2c6bad197adddba7ebdff"

RPROVIDES:${PN} += "libdevmapper-event.so.1.03 \
libdevmapper-event1-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
