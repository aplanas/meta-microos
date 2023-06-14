SUMMARY = "Kea utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-util52-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "ce632e9049047f4d25b92fdd266e716dbb271ad27acdbf80a2709fa527cb1c1300ae6560ddde7bf71af8848eeaf074b981440587c8958b82b4aca011024a1394"

RPROVIDES:${PN} += "libkea-util.so.52 \
libkea-util52"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.13 \
libstdc++.so.6"

inherit rpm
