SUMMARY = "Kea DHCP server socket I/O abstraction layer library"
DESCRIPTION = "The asiolink library provides an abstraction layer between BIND10/Kea \
modules and the socket I/O subsystem Kea is using (currently, \
boost::asio)."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-asiolink40-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "6f3cf32a4e171b300c9a64fcbef8ef18207c487e2672c0adfe5794130d74c57bab5495bfd6e9c4b576786ea7b8758ff64060c4e50c90f6881c45c4543cbe14b9"

RPROVIDES:${PN} += "libkea-asiolink.so.40 \
libkea-asiolink40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-exceptions.so.13 \
libkea-util.so.52 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
