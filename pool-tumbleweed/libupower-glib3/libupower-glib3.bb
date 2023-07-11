SUMMARY = "Power Device Enumeration Framework - Library"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.1"

RPM_NAME = "libupower-glib3-1.90.1-1.1.aarch64.rpm"
RPM_HASH = "e7b1809447c986d4b8dcf49b137c48275acfdb84ed112fa69cacd5eb4dbeb8f438b6268bae6cbe95c2d252f285a23816711a1f54a640181580c172576afc8811"

RPROVIDES:${PN} += "libupower-glib.so.3 \
libupower-glib3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
