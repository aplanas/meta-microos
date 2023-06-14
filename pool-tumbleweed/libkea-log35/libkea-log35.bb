SUMMARY = "Kea DHCP logging system library"
DESCRIPTION = "This library contains the Kea logging system, which is based on the \
log4J logging system common in Java development, and includes the \
following ideas: a set of severity levels; a hierarchy of logging \
sources; separation of message use from message text."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-log35-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "cb10c6cedf8098730b81ae61ca0876e0323347d94a823715b38149a0ef924159bffec120bd36583a54f55d588b8523badf06290cbba83937ae88a770a412feb3"

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
