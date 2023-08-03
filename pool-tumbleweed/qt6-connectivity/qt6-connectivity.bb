SUMMARY = "Qt 6 connectivity tools and libraries"
DESCRIPTION = "Qt 6 connectivity tools and libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-connectivity-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b5c0bfa7ae854c0fdc3947eaeb235c58874311054350b2fbbbe978349b8f68adb5452ec8f625adc4504a80bda136bd36240d466c6f16c42039a8d9ae21a0db11"

RPROVIDES:${PN} += "qt6-connectivity"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
