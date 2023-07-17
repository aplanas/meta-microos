SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsQmlModels6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "f9e4efb0e9dc68d0f674d22f7ffb2c8771b5a475a77ef9a8c81c74b6e354c22f0ce57fc019be3a521be38d12a97a794066592bb656c9797f39d66bee50b9afd2"

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
