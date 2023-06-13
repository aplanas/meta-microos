SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libindilx200-1-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "244953ab9e671ab9f2373b407d02725d9976a5a3dab8afcbba493856a625aa76cf2c8fe1cc577eb696ca261673cc914964701bc3a4124997683d1c27fe83ad16"

RPROVIDES:${PN} += "libindilx200-1 \
libindilx200-1(aarch-64) \
libindilx200.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnova-0.15.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
