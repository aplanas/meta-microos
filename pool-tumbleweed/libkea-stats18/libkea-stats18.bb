SUMMARY = "Kea DHCP Statistics Manager library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-stats18-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "d254af08e4cb6ede9cd400271a05e4e1340336115751687d5b547ddef7544a05898634503c106f00fd7ad518e00415cbb731491da2b43c1f6ded406ce04a6ac7"

RPROVIDES:${PN} += "libkea-stats.so.18()(64bit) \
libkea-stats18 \
libkea-stats18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
