SUMMARY = "Header files for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-devel-0.8-23.3.aarch64.rpm"
RPM_HASH = "450d2ef06fa5c9fea01d88fadaa8b1d85155ca1b1aec50281fae3eb8859f4b9a37c6831800a846d87a5450e717e342d6315fed27ac1bc33cc2531bfbc1c24974"

RPROVIDES:${PN} += "avahi-devel \
libavahi-devel \
pkgconfig-avahi-client \
pkgconfig-avahi-core \
pkgconfig-avahi-libevent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-devel \
glibc-devel \
libavahi-client3 \
libavahi-common3 \
libavahi-core7 \
libavahi-libevent1 \
pkgconfig-libevent"

inherit rpm
