SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindidriver2-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "889b7cc786714a6b3c739bb5b9ef9e5485cba994b437bc39a2ef0970f5693c3a2e07e4a93bda8f812b04eab2b5d3bb70e64c52b9fc5ec662ffdb71b529d5dfad"

RPROVIDES:${PN} += "libindidriver.so.2()(64bit) \
libindidriver2 \
libindidriver2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libXISF.so.0()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libnova-0.15.so.0()(64bit) \
libogg.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtheoradec.so.1()(64bit) \
libtheoraenc.so.1()(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
