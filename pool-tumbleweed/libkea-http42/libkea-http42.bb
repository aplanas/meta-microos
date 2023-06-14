SUMMARY = "Kea DHCP http communication library"
DESCRIPTION = "This library is used by Control Agent to establish HTTP connections, \
receive messages and send responses over HTTP. This library uses \
boost ASIO for creating TCP connections and asynchronously receive \
and send the data over the sockets."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-http42-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "3705ddede484843dc957570b868eab8999c397c988803506cb30306faf986bd69d35b0840831aa1de7ee3332b9bffe015aafb3342a06209765179df6fe54d25b"

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
