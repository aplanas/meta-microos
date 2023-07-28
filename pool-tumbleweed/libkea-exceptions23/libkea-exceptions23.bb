SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-exceptions23-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "61556043cc6513796203606afdfe6acc56de9cddd0f3bfe30ca7afb7dcd1d4627872fbbcd33985625aaf68965841836ed79e797a99ef2b4d6843301d149c0940"

RPROVIDES:${PN} += "libkea-exceptions.so.23 \
libkea-exceptions23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
