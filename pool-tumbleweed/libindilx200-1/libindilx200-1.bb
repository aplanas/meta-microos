SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libindilx200-1-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "2e2cb2c3c715983a05e9ac0ef6b5864121267bca5abe3d08ed84799d89426ac11a7552370c8a38844985c716ffde33bed1e2edec348b43fb93896381acd48d0d"

RPROVIDES:${PN} += "libindilx200-1 \
libindilx200.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnova-0.15.so.0 \
libstdc++.so.6"

inherit rpm
