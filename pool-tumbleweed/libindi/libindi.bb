SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindi-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "32bd7a60f9d6a898215002d7b8c3a18ff84b4e18608ea84e126edf0e3a9032087813ac95fcdff05d165e60e19f4e4fb9e09abb1b2950e310d0b0f40b6586274c"

RPROVIDES:${PN} += "libindi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libcurl.so.4 \
libev.so.4 \
libgcc-s.so.1 \
libindi-plugins \
libindiAlignmentDriver.so.2 \
libindiclient.so.2 \
libindidriver.so.2 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
