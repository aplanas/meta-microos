SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsQmlModels6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "6ad1d920168582fb33d3a6e29483f41e2e7dc26ae68ccaceacf26ad9968fc3bb158f7a0beaf0b981ac614eb8c4abf5495418e248f7d22b1bb0aa116bcad8c318"

RPROVIDES:${PN} += "libQt6LabsQmlModels.so.6 \
libQt6LabsQmlModels6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
