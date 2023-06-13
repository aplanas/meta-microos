SUMMARY = "Header files for Avahi's Qt5 bindings"
DESCRIPTION = "Development files for the Qt5 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt5-devel-0.8-23.1.aarch64.rpm"
RPM_HASH = "d21bfdcd52164e204f292bf6d5761c5842d212d2d9914bc53381f22fc7ec031edc3a8efc00ccda0369f8c1cbfd03d6659d9f53b8dd456395cd7e7220245a061d"

RPROVIDES:${PN} += "libavahi-qt5-devel \
libavahi-qt5-devel(aarch-64) \
pkgconfig(avahi-qt5)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libavahi-qt5-1 \
pkgconfig(Qt5Core)"

inherit rpm
