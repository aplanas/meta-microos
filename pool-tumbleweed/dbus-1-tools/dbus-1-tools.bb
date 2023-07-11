SUMMARY = "Tools that go along with dbus"
DESCRIPTION = "D-Bus is a message bus system, these are some of the tools that go along \
with it."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.8"

RPM_NAME = "dbus-1-tools-1.14.8-1.1.aarch64.rpm"
RPM_HASH = "f0a50bb741f13f65323d0f54455e384341032c3ebe9e34af8dae877679aaaed609b335cb0400627cb801ee06fd23ba510a2b27ab9d68f9f8dbc07d3e278e89bf"

RPROVIDES:${PN} += "dbus-1-/usr/bin/dbus-monitor \
dbus-1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
