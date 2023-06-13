SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindiclientqt2-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "4c695046813ad71b51aec4dcca008869e3c826e5aa49f2546d2af0f31211181a01ce9c08052ebc18608429f6234d0d23a03d5c15e38f2c9d06e21e951747a571"

RPROVIDES:${PN} += "libindiclientqt.so.2()(64bit) \
libindiclientqt2 \
libindiclientqt2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libnova-0.15.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
