SUMMARY = "Qt 5 Quick Timeline Addon"
DESCRIPTION = "The Qt Quick Timeline module provides QML types to use timelines and keyframes \
to animate Qt Quick user interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtquicktimeline-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "8c1628aa6f87abe12e6a941f9c38e1ec7c29e42579a4468f02fa087cc22b25ab7e152cb20ac4648ebb3e0a966363bb4ce985ea93b71b6d292bf2b9bc9f75faa3"

RPROVIDES:${PN} += "libqt5-qtquicktimeline \
libqtquicktimelineplugin.so \
qt5qmlimport-QtQuick.Timeline.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
