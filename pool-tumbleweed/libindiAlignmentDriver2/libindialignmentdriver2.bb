SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindiAlignmentDriver2-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "d221f5a50b8d2c6a3adbf30d885ae375f576c05fbce80613abfad0d4f40ec547ecefaea1a6fe4ae995d0dc7775c0a5a346328ac7ee03a30cd02e88870699b060"

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
