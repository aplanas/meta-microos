SUMMARY = "Library package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "libdbus-1-3-1.14.8-1.1.aarch64.rpm"
RPM_HASH = "db21a0633504f6bc0ff40e10b7c86c35da121a94298eb02e7eec82e9005ffdc9960cebd819dea1ded9f862418345bd20c400f2ac62a1b848158315c8dc89e133"

RPROVIDES:${PN} += "libdbus-1-3 \
libdbus-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
dbus-1-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
