SUMMARY = "Power Device Enumeration Framework"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.0"

RPM_NAME = "upower-1.90.0-1.4.aarch64.rpm"
RPM_HASH = "d2695bc09fd978d9a8157b38c6c3a55cedc385fd651b2543ce2e9a05295350d8e1e9523c4ba5b6d4275c8c09194d8ac272e104bd0f4563a5b2b92443000c7172"

RPROVIDES:${PN} += "config(upower) \
upower \
upower(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libupower-glib.so.3()(64bit) \
systemd"

inherit rpm
