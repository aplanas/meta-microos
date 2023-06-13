SUMMARY = "GObject-based library for the Telepathy D-Bus API"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "libtelepathy-glib0-0.24.2-1.10.aarch64.rpm"
RPM_HASH = "5a9cc8f089ad85bed0bc408d9388d386d686011dab6e1904fdd65f93d4f1bb0fdaef111506040a32eaac1914470a7e412b9becfd14fc5a969c5b02184996c138"

RPROVIDES:${PN} += "libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib0 \
libtelepathy-glib0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
