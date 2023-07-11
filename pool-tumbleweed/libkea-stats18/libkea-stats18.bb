SUMMARY = "Kea DHCP Statistics Manager library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-stats18-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "c20936048bec89ad6b0fad59f83d16722fb2ec2e0ee5c65846553ba91e23144c702ec7ee796572145bf4d33f6f01829a321d85cb94e28e4f1f1a299f658c3660"

RPROVIDES:${PN} += "libkea-stats.so.18 \
libkea-stats18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.39 \
libkea-exceptions.so.13 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
