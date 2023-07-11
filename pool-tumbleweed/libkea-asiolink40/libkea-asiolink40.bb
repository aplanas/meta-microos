SUMMARY = "Kea DHCP server socket I/O abstraction layer library"
DESCRIPTION = "The asiolink library provides an abstraction layer between BIND10/Kea \
modules and the socket I/O subsystem Kea is using (currently, \
boost::asio)."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-asiolink40-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "e086334ab3c172c1c5b76967e151bea1fda2ebfcb4f5894ed7532bad2d510cfb5557cdb70558ea043ca028c27f2cbe62a9be6c075ee10929e737de973021f4ea"

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
