SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindilx200-2-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "ab2a56705976b2c27631c77569217d32bdbc05a1c55f5c10f78506e07dcf4703186e4368c8b803683adcaa68e46ecea6606d118943b701ba464d9e49b22aca29"

RPROVIDES:${PN} += "libindilx200-2 \
libindilx200-2(aarch-64) \
libindilx200.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnova-0.15.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
