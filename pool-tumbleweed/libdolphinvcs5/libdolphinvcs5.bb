SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libdolphinvcs5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2f8f4001482ff224dd5436e670e5c5043291a126ec7a56a13273ea8af79cdefd6b4894de0a3c4ff09e91fef539c8e4c4fa7581530f1afc1e942fb6a42b57d10e"

RPROVIDES:${PN} += "libdolphinvcs.so.5 \
libdolphinvcs5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
