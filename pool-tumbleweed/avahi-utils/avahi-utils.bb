SUMMARY = "Command Line Utilities for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-utils-0.8-23.1.aarch64.rpm"
RPM_HASH = "33b7ee7d3ddc6a21e6957208ef765adf88f549b04050f6c240172b7fa90ec4065f2d78cf335c3907c6841a709606f701b2a14a240be743f3b1ed379820382bb1"

RPROVIDES:${PN} += "avahi-utils"

RDEPENDS:${PN} += "avahi \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
