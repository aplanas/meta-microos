SUMMARY = "Developer package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-devel-1.14.6-2.3.aarch64.rpm"
RPM_HASH = "3c0bde856110b55fe54da45a2d796d9a400575e3494d38afc188c5d464000bb6e8b9cbebe51d4e2290c9624e5b0dda99d27b4d83ba544467d4bb7fa1a660f2f8"

RPROVIDES:${PN} += "cmake(DBus1) \
dbus-1-devel \
dbus-1-devel(aarch-64) \
pkgconfig(dbus-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
glibc-devel \
libdbus-1-3"

inherit rpm
