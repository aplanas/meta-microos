SUMMARY = "Power Device Enumeration Framework - Library"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.0"

RPM_NAME = "libupower-glib3-1.90.0-1.4.aarch64.rpm"
RPM_HASH = "1f38134419210a5d533f6569e37f4822b6ef2bc55c3019787475421d42ed23eb00d29fc69c3dcff89b4fc324760ed5adb82cad7daefdcab25eb26d0824a8be8e"

RPROVIDES:${PN} += "libupower-glib.so.3()(64bit) \
libupower-glib3 \
libupower-glib3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
