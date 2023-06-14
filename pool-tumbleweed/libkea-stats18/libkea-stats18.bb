SUMMARY = "Kea DHCP Statistics Manager library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-stats18-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "d254af08e4cb6ede9cd400271a05e4e1340336115751687d5b547ddef7544a05898634503c106f00fd7ad518e00415cbb731491da2b43c1f6ded406ce04a6ac7"

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
