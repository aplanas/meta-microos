SUMMARY = "Jack Audio Connection Kit D-Bus support"
DESCRIPTION = "This package contains the D-Bus support for JACK \
(Jack Audio ConnectionKit)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "jack-dbus-1.9.22-2.1.aarch64.rpm"
RPM_HASH = "2757993d34986e32016f73a1e768190111ba95c37b6921bd6d77b81118d9a7e30e9d1757d1789a560efee624e99d7dfa012ea3e732d89aac4d8699110e04d869"

RPROVIDES:${PN} += "jack-dbus \
jack-dbus(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
jack-daemon \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libexpat.so.1()(64bit) \
libjackserver.so.0()(64bit)"

inherit rpm
