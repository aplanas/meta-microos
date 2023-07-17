SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Activities5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "81f0a1af4c4f8ba4dd29ab3ea9cf86076aa59eb26dfbbd5fd9da02b53311f667ba8c6cca88addea4cc11c1a8abf374c43ea5286bf6df494e5da827b4fe4dbb8b"

RPROVIDES:${PN} += "libKF5Activities.so.5 \
libKF5Activities5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
