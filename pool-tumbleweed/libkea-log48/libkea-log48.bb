SUMMARY = "Kea DHCP logging system library"
DESCRIPTION = "This library contains the Kea logging system, which is based on the \
log4J logging system common in Java development, and includes the \
following ideas: a set of severity levels; a hierarchy of logging \
sources; separation of message use from message text."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-log48-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "b436fcee5d88708db3bd811be0a92b0813b991a56d9a5f3fdfe369409e6d37d1ccff2b14ad77325610476d9b06958fdbc96accaf3c3629c06e1bf55f1a09ec41"

RPROVIDES:${PN} += "libkea-log.so.48 \
libkea-log48"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.23 \
libkea-util.so.68 \
liblog4cplus-2.0.so.3 \
libstdc++.so.6"

inherit rpm
