SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindiclientqt2-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "a5b9fe590b81122a946e4127701f8d53cdc241cddccec2e1feb54746da12baf8ac3de95710ecff069c5008f2ee5536d18d2cf3661ea1678843ec4721e5f195dc"

RPROVIDES:${PN} += "libindiclientqt.so.2 \
libindiclientqt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
