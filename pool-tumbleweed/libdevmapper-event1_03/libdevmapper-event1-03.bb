SUMMARY = "Event library for device-mapper"
DESCRIPTION = "Device mapper event daemon shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper-event1_03-2.03.16_1.02.185-6.3.aarch64.rpm"
RPM_HASH = "998713eceb967425027e84a2d6a76b0a7442fa2f9ea452bfc149b66e5f697636c11f7df2166c936ef2c0f5bce750b97359c9d80dcac3aaeabab60a4517ccd65d"

RPROVIDES:${PN} += "libdevmapper-event.so.1.03 \
libdevmapper-event1-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03"

inherit rpm
