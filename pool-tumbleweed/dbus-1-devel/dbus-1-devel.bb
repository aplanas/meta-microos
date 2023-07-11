SUMMARY = "Developer package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-Bus supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-devel-1.14.8-1.1.aarch64.rpm"
RPM_HASH = "660c11b0ca8a013cb1d2306f8cc84feb91aa2bfd7afd7aef02dc744d3321b3b9f53a7180d1126d8551e75c8e2ca89221e9bb1ad599bab8e0cc21843942dfc825"

RPROVIDES:${PN} += "cmake-DBus1 \
dbus-1-devel \
pkgconfig-dbus-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1 \
glibc-devel \
libdbus-1-3"

inherit rpm
