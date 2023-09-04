SUMMARY = "Power Device Enumeration Framework - Library"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.2"

RPM_NAME = "libupower-glib3-1.90.2-1.1.aarch64.rpm"
RPM_HASH = "a340729d67dd8533f5cb232d5ea26fabfefdf10d83d0c142bac7778c23371960ac8e2fd44e8aca4e4a0adabab966c18c3abe06fcbf30546e2b44e2af07c3c377"

RPROVIDES:${PN} += "libupower-glib.so.3 \
libupower-glib3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
