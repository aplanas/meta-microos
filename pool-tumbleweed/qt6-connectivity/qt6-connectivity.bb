SUMMARY = "Qt 6 connectivity tools and libraries"
DESCRIPTION = "Qt 6 connectivity tools and libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f6f7adf31476ba169225a2276e7f3470696f0041c4a2a6bc1cb57b583f6fb4ece6bc9d4972d66bc871255107c980a2578d8c5ac12afb6029ae917bad91512217"

RPROVIDES:${PN} += "qt6-connectivity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
