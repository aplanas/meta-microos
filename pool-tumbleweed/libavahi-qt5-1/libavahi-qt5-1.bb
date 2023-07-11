SUMMARY = "Qt5 Bindings for avahi, the D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Qt5 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt5-1-0.8-23.2.aarch64.rpm"
RPM_HASH = "cc322a6083691228878f93261791eec14b4bb4cf09f6c8bde2f73ca5f706b7c189ae73cfbf1f86a035acbd9939f70c68ae393cda9d59c1ee7419999d10083bb8"

RPROVIDES:${PN} += "libavahi-qt5-1 \
libavahi-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
