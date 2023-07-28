SUMMARY = "Kea DHCP Statistics Manager library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-stats29-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "f3100362df6e4523ed110607236be42ddecb000c427d6728dd7e38d99f51b76b4450c6d1015688c57fdb73e18fd0b38435e5df5ff933ce0ef909bad978ce3dde"

RPROVIDES:${PN} += "libkea-stats.so.29 \
libkea-stats29"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.54 \
libkea-exceptions.so.23 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
