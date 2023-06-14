SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "indi-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "3ffe106fd02860c8ec966f63902c08a89426d6d66569088d248009ca642cf59fd70e840a0fb6d4e72a63c0a9bb41a131da547141034aaf6ca3ea05884f4cb3fb"

RPROVIDES:${PN} += "indi"

RDEPENDS:${PN} += "indi-plugins \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libcurl.so.4 \
libev.so.4 \
libgcc-s.so.1 \
libindiAlignmentDriver.so.1 \
libindiclient.so.1 \
libindidriver.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
