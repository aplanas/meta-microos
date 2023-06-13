SUMMARY = "Library package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "libdbus-1-3-1.14.6-2.3.aarch64.rpm"
RPM_HASH = "82d4867973dec5d2e6dfe853fac3b733de030e6f9091cc10edbe11f86a5b57067f28efb69b91a331b480043dd975f4f6a94fcf325911f5e83166924883ed03c8"

RPROVIDES:${PN} += "libdbus-1-3 \
libdbus-1-3(aarch-64) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
dbus-1-common \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
