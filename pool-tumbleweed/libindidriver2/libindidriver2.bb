SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindidriver2-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "46636e52d3aa31d4f32b6b2e1d23160160bab132e70a891fa3be823ec21a82c02e442a3a04d41e0a013696f0914038cd7e0174a1784c45011db9a5fcda782f52"

RPROVIDES:${PN} += "libindidriver.so.2 \
libindidriver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXISF.so.0 \
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
