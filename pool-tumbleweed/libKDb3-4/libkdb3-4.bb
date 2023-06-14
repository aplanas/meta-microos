SUMMARY = "The library for the Database Connectivity and Creation Framework"
DESCRIPTION = "The library for the database connectivity and creation framework for various database vendors"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKDb3-4-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "3e9fca2444e3e80c1d0c5aacc9aa92e533c9fbdba5ab3478558ea72b73e4f8b5b6f7863ed628c57343d10376e736dabb210ffd1c9a780793e53cb8e668464bf8"

RPROVIDES:${PN} += "kdb \
libKDb3-4 \
libKDb3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libicui18n.so.73 \
libstdc++.so.6"

inherit rpm
