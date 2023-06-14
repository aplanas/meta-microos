SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libindidriver1-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "66df25e72e2825e84c6fae309d32cfcd9d307ddd299afaf5e2455cdca0d469a86d07e30c6a97646993616c7f8c6a7186cfa75a894a1a729ff057b654c1dd80a1"

RPROVIDES:${PN} += "libindidriver.so.1 \
libindidriver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libnova-0.15.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libtheoradec.so.1 \
libtheoraenc.so.1 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
