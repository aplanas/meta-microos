SUMMARY = "Tools that go along with dbus"
DESCRIPTION = "D-Bus is a message bus system, these are some of the tools that go along \
with it."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.6"

RPM_NAME = "dbus-1-tools-1.14.6-2.3.aarch64.rpm"
RPM_HASH = "32203fa4c9504443dc2ef174b59e059f16d978e13143a40f84b026022d99f71f0ec25ef9b5e133d5ccde93a5f37ab10ef6adf8a65fd8af33850d590c7ae335c9"

RPROVIDES:${PN} += "dbus-1-tools dbus-1-tools(aarch-64) dbus-1:/usr/bin/dbus-monitor"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-1.so.3(LIBDBUS_PRIVATE_1.14.6)(64bit)"

inherit rpm
