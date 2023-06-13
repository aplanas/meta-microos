SUMMARY = "Generic Spell Checking Library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "libenchant-2-2-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "f375a195556c813768df3b33bea248ab3f51ae12bd617001180753a906ffe10b5038ea7560084071c3ca5d2e8f6b1abd17b094a3da656006d1d2b3c61c09b556"

RPROVIDES:${PN} += "libenchant-2-2 \
libenchant-2-2(aarch-64) \
libenchant-2.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
enchant-2-backend \
enchant-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit)"

inherit rpm
