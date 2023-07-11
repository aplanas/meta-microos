SUMMARY = "QtAV QML module"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV QML module for Qt declarative."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-qml-1.13.0-3.27.aarch64.rpm"
RPM_HASH = "5f08e29ce451dcaa15d5dba20855c6f019a7dec540116cfc77973fbccdfa6e01f78cee47b5fe32bd1a5abe6fb55d43591c276aea28bd71629c3c3db3943f88a8"

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
