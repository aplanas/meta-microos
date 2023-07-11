SUMMARY = "Kea DHCP logging system library"
DESCRIPTION = "This library contains the Kea logging system, which is based on the \
log4J logging system common in Java development, and includes the \
following ideas: a set of severity levels; a hierarchy of logging \
sources; separation of message use from message text."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-log35-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "e9027d6815b6800598e4995c13fda29b521b67704d4780e29fb0288f1498791637f65f96fe9032e4ca7899dcbf37b245653d16fbebfb60820eb15720895bdd30"

RPROVIDES:${PN} += "libkea-log.so.35 \
libkea-log35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.13 \
libkea-util.so.52 \
liblog4cplus-2.0.so.3 \
libstdc++.so.6"

inherit rpm
