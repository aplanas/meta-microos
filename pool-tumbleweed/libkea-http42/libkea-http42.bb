SUMMARY = "Kea DHCP http communication library"
DESCRIPTION = "This library is used by Control Agent to establish HTTP connections, \
receive messages and send responses over HTTP. This library uses \
boost ASIO for creating TCP connections and asynchronously receive \
and send the data over the sockets."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-http42-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "130e5999d99e5ef18a2504b5f536c4a7405a3496f1c3b9a0fff336a9ee121c085b9a00a75cda5bb645eb3cfe7722e250aced929ccac7be14cd9022b6dde46b33"

RPROVIDES:${PN} += "libkea-http.so.42 \
libkea-http42"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-log.so.35 \
libkea-util.so.52 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
