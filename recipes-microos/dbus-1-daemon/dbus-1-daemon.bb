SUMMARY = "D-Bus message bus daemon"
DESCRIPTION = "D-Bus is a message bus system, This package contains the original \
dbus-daemon to make it easier to switch to dbus-broker"
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-daemon-1.14.6-2.3.aarch64.rpm"
RPM_HASH = "da8c17e69fe120e948b49e2afd376ef968832475f3db7f912795132444b5db20a3182c8a1b3fd04a8b294d7dac6e86652e974bdde0a68c2c68c954ec3386fe08"

RPROVIDES:${PN} += "dbus-1-daemon \
dbus-1-daemon(aarch-64) \
dbus-1:/usr/bin/dbus-daemon \
dbus-service"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap-ng.so.0()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-1.so.3(LIBDBUS_PRIVATE_1.14.6)(64bit) \
libexpat.so.1()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
