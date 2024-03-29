SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindi-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "9be7d9fa3b51afb0ac8bc5c7cb28619b435b973b345720d5ebccad72c10920d88b45d83c7197c418067fd5e6940adafd97396fb2eae9be5dc90fe8ef2f83c029"

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
