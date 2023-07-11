SUMMARY = "MISC function library"
DESCRIPTION = "Different functions for different purposes but that can be shared \
between other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "liborcania2_3-2.3.2-1.4.aarch64.rpm"
RPM_HASH = "01d85836368f5d8f8daf0718f6fa9f74c2ba8ff4918619b713193437d9ed5231e2cd4b7f2e2f3db68a052733b89130a50944131938e90a93e7f96c669857f364"

RPROVIDES:${PN} += "liborcania.so.2.3 \
liborcania2-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
