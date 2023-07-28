SUMMARY = "Kea DHCP http communication library"
DESCRIPTION = "This library is used by Control Agent to establish HTTP connections, \
receive messages and send responses over HTTP. This library uses \
boost ASIO for creating TCP connections and asynchronously receive \
and send the data over the sockets."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-http56-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "83c6f88f3b2fa4c234f4d77eb212263bd97ffa4cbea3aedf79091a2ea7f9e90ed04fbb68d78da5bba92d352ec969fd7cc7bfb9f49db10461c3aed14f80f84e38"

RPROVIDES:${PN} += "libkea-http.so.56 \
libkea-http56"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-log.so.48 \
libkea-util.so.68 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
