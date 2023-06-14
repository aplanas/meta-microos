SUMMARY = "QtAV QML module"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV QML module for Qt declarative."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-qml-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "bdcfcef5343ec9390102bc9c465198f11b5908119a360d578037d617381604d7150c2031f83d519493828bf3dbb20af0966305b913c878d54505410badb9e18b"

RPROVIDES:${PN} += "QtAV-qml \
libQmlAV.so \
qt5qmlimport-QtAV.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQtAV.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt5qmlimport-QtAV.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
