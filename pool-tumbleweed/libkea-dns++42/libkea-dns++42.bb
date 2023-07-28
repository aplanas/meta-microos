SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-dns++42-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "fb0618c710e111cb0ed49f671f96e99ab3c90474453f7478cbc3d97a63d5f5daa56d773fd1407bc4cb5d30318397240fdf362f24757109ef563a910e1078d256"

RPROVIDES:${PN} += "libkea-dns++.so.42 \
libkea-dns++42"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cryptolink.so.38 \
libkea-exceptions.so.23 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
