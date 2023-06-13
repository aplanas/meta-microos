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

RPROVIDES:${PN} += "libindi \
libindi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libcurl.so.4()(64bit) \
libev.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libindi-plugins \
libindiAlignmentDriver.so.2()(64bit) \
libindiclient.so.2()(64bit) \
libindidriver.so.2()(64bit) \
libm.so.6()(64bit) \
libnova-0.15.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
