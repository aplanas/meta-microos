SUMMARY = "Header files for Avahi's Qt5 bindings"
DESCRIPTION = "Development files for the Qt5 support for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-qt5-devel-0.8-23.2.aarch64.rpm"
RPM_HASH = "fc45bc856ef949bcdb43cc39f8aa48c4318d29fa6eae0e43f3a60f1a524042e1cfcb03535cf6f4f5bda340c12c33d94ecef138dac43687567bded0760f217eb1"

RPROVIDES:${PN} += "libavahi-qt5-devel \
pkgconfig-avahi-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libavahi-qt5-1 \
pkgconfig-Qt5Core"

inherit rpm
