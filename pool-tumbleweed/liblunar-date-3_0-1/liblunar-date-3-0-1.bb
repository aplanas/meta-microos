SUMMARY = "Chinese Lunar calendar library"
DESCRIPTION = "Library to support date conversion from/to chinese lunar calendar"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "liblunar-date-3_0-1-2.9.3-2.14.aarch64.rpm"
RPM_HASH = "a4a666ce11d065ea72129e467a4490e12ae7b1f03d74dee45f21cce7bfba79d450a890d8f65cfd4b35d3f5d4c593b844c0b811578ffd98e9744b2701a7738340"

RPROVIDES:${PN} += "liblunar-date-3.0.so.1()(64bit) \
liblunar-date-3_0-1 \
liblunar-date-3_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
