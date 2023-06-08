SUMMARY = "Developer documentation package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-BUS supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-devel-doc-1.14.6-2.1.noarch.rpm"
RPM_HASH = "2b9cfd2cd47a68828330d7b59a627a6d690ff4fd284d8e50786eb5086f1bea6b638a70cc474f3aca17c84032334e841c15932aa6efe0c3e99c97edbff41a46c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-1-devel-doc"
RDEPENDS:${PN} += "dbus-1"

inherit rpm
