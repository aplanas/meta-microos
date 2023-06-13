SUMMARY = "Libraries for ATM"
DESCRIPTION = "Libraries for ATM (Asynchronous Transfer Mode) networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "libatm1-2.5.2-8.8.aarch64.rpm"
RPM_HASH = "cd60d1b8471293a3e134d0633d35db70d2f2b5f7d8612095ae3adbb22a911473cb149dcd30402022ed6067c08a2ade16c5fe3f08014ce4e9c77959eb2b591f98"

RPROVIDES:${PN} += "libatm.so.1()(64bit) \
libatm1 \
libatm1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
