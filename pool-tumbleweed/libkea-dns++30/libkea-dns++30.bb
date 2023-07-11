SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dns++30-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "ac002e32b55359135e2666c71f491673a95eb3e67faf4b7c8ab75c1501bdc6ed54d419fbb1a479329a66d8bafae086d46187aee733497c546d0513b550fdd2da"

RPROVIDES:${PN} += "libkea-dns++.so.30 \
libkea-dns++30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cryptolink.so.28 \
libkea-exceptions.so.13 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
