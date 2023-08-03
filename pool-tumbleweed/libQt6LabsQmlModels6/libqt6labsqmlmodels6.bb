SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6LabsQmlModels6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4a2280834858ca81e6cde55a0b65e9b620069c3c23f2217d85003d8b442ee0a854922b8954968df00050122b18187778f5f2d79217d25686f01540ec249c0367"

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
