SUMMARY = "QtAV/QML players"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV based players."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-players-1.13.0-3.27.aarch64.rpm"
RPM_HASH = "e7b465e9e4a676c74d38a89f41a696968475dabde272eefffab03d37d95b7d93787f4d3c4aefc8c8f3ebdcc4894fe81b1f02e5a08b6426cadcac52c2e8a99b75"

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
