SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libindiclient1-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "b59753dced94a30dcaa5962b053643c0eb92815c4ca8301bd43cbd5a2ab70e7f4dc2016459e19a6074349c426345340fc9b9d1bbe936e05225eebc1b3e05a70d"

RPROVIDES:${PN} += "libindiclient.so.1 \
libindiclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
