SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlModels6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "2e6610bf989494ed4a51b6f3acbc7e154f51660e8d5ad2176b3a92648d96e46c199d8406b1ad13c92f25058882ce990ea9565317b57822fdd53c3c1e85420691"

RPROVIDES:${PN} += "libQt6QmlModels.so.6 \
libQt6QmlModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
