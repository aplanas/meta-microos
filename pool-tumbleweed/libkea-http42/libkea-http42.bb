SUMMARY = "Kea DHCP http communication library"
DESCRIPTION = "This library is used by Control Agent to establish HTTP connections, \
receive messages and send responses over HTTP. This library uses \
boost ASIO for creating TCP connections and asynchronously receive \
and send the data over the sockets."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-http42-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "3705ddede484843dc957570b868eab8999c397c988803506cb30306faf986bd69d35b0840831aa1de7ee3332b9bffe015aafb3342a06209765179df6fe54d25b"

RPROVIDES:${PN} += "libkea-http.so.42()(64bit) \
libkea-http42 \
libkea-http42(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-log.so.35()(64bit) \
libkea-util.so.52()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
