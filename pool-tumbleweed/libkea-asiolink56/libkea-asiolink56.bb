SUMMARY = "Kea DHCP server socket I/O abstraction layer library"
DESCRIPTION = "The asiolink library provides an abstraction layer between BIND10/Kea \
modules and the socket I/O subsystem Kea is using (currently, \
boost::asio)."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-asiolink56-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "edbeabd08c4a0a8aa250243583aae51a842aeb05bc6a68c7ae45304ae4ad0c89c802dc037c4d3f05b83bc9d42339e7f8b4b20a6e1c1a369e0ac074da943e135d"

RPROVIDES:${PN} += "libkea-asiolink.so.56 \
libkea-asiolink56"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-exceptions.so.23 \
libkea-util.so.68 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
