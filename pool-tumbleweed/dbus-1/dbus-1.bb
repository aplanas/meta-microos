SUMMARY = "D-Bus Message Bus System"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-1.14.8-1.1.aarch64.rpm"
RPM_HASH = "6fe79cb5f39e11dbf565646f8924f502d10aed1f1543fcc86a0b3d720b2d8d27649b95b1af0defe5d7059c1cfbafc0d6789cb44805a7aaa612106ba2ba241544"

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
