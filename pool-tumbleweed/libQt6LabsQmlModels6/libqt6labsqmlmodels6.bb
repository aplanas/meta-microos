SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6LabsQmlModels6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2a7932d7c57d05cc1de0f0034e22be4fdd556a7a98b6bb0532405fd07646934a3015bb8c5d215b831a0996908782a5df32285df1c5f2288c3b04d44d1b3e7425"

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
