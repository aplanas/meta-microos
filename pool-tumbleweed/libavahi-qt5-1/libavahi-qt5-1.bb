SUMMARY = "Qt5 Bindings for avahi, the D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Qt5 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt5-1-0.8-23.1.aarch64.rpm"
RPM_HASH = "411bea8980e2292a0a6cbac97cdc2900589ca8b7fe8bd61d95aaef6ccfb6b38475cb4cd611e362e6d7050de0e91a4c94ac34f653c4bd95e80e84bde685666038"

RPROVIDES:${PN} += "libavahi-qt5-1 \
libavahi-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
