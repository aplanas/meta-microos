SUMMARY = "D-Bus Message Bus System"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-1.14.6-2.3.aarch64.rpm"
RPM_HASH = "44db4cf4e66a4746b875f416926e7b6a822486c9ac029709cfc3c218f837f99d44a397153424da267ac5cbff6f3f969eefc4e454143d11192620c14af2a3fac7"

RPROVIDES:${PN} += "dbus-1 \
dbus-launch"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
dbus-1-common \
dbus-1-tools \
dbus-service \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1-3 \
libdbus-1.so.3 \
libexpat.so.1 \
libsystemd.so.0 \
permissions"

inherit rpm
