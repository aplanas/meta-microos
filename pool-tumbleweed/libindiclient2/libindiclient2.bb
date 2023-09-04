SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindiclient2-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "f18b1d0ad6e39b367c30eca3cfa61037f19a4fefc3d78a7bb0e3d7fa11c82e939e8d3ae76ca1f411ea51eb14165fdea974f72fd37705c7bdc7056058313a44d7"

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
