SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "indi-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "27f798cb2749c91e3be5cb4fbf5381c92e2338edfb8f40ea55cb81d9a33848ba700b31c477f13520609012bc60c165a6a154d250a7cfef9b3e59c704bc1ca1b9"

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
