SUMMARY = "Kea TCP library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-tcp5-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "f2c46fdcc25a476ffe3eeff855a993fd0fd0e3b31d12ae9140cf9f480ee369147692e68b2defeac0743b586a461675c9af34b88f01396c1d43b9b420d17a7c4e"

RPROVIDES:${PN} += "libkea-tcp.so.5 \
libkea-tcp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libkea-util.so.68 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
