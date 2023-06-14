SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindiclient2-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "97a6c34890f1e1dd5b02144cfbe37a2c7253221f5efc549e387a4bb78177280b744b3abaa7ed52d7d5f29c6042d1068aef677b51c16a0b71e3657fae16b5642a"

RPROVIDES:${PN} += "libindiclient.so.2 \
libindiclient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
