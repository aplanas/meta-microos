SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libindiclientqt1-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "697d990b52bb5531c1a9b4383cad9f8e9a44465b5043985dd6dd244c17fc6857ebcd7f839ae7a5fd9e57fde3708db0654c4cd848861d83540330ba0f1daa1003"

RPROVIDES:${PN} += "libindiclientqt.so.1 \
libindiclientqt1"

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
