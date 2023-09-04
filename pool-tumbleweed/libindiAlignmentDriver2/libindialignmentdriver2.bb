SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindiAlignmentDriver2-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "061cf11c3cdb1658652857a1a409b53b880c97c0a3568a78be9f27fad4f52c9523b021548a6f112ff9ad54411798531c483f8dc81747d80a28951adfb4c933c1"

RPROVIDES:${PN} += "libindiAlignmentDriver.so.2 \
libindiAlignmentDriver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libindiclient.so.2 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
