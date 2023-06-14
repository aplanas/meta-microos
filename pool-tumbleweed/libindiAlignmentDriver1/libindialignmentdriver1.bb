SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libindiAlignmentDriver1-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "54609220fc5f226ec972ea7fce99776c3b482284eb15e9ef268cb43d6247dd2bf5305b2b356d58439bde1d6c1dee15cd5a54a207f952bdfd860ce84345e806f8"

RPROVIDES:${PN} += "libindiAlignmentDriver.so.1 \
libindiAlignmentDriver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libindiclient.so.1 \
libm.so.6 \
libnova-0.15.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
