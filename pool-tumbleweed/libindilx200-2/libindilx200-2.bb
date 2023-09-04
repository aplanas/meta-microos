SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "libindilx200-2-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "22d6b1db53287871d9b6ff25b49235a8e3bc059908c8457e76d5f845f18c2a05237c53ea9fd7109a5a7a167c9f3e43c2453995e10b0556a459e2405421039d22"

RPROVIDES:${PN} += "libindilx200-2 \
libindilx200.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnova-0.15.so.0 \
libstdc++.so.6"

inherit rpm
