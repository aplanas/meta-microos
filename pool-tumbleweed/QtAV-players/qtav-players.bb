SUMMARY = "QtAV/QML players"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV based players."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-players-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "34b95a6a6d6a75e5c244ab6149c179782ddc9870f8f4afe2fa2d434aee88b1922ce6b279a090e85c560ebdeccf9e31610f0019d77d38e6a1416376e9735150e2"

RPROVIDES:${PN} += "QtAV-players"

RDEPENDS:${PN} += "/usr/bin/sh \
QtAV-qml \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Svg5 \
libQt5Widgets.so.5 \
libQtAV.so.1 \
libQtAVWidgets.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqt5-qtquickcontrols \
libstdc++.so.6"

inherit rpm
