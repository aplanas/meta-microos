SUMMARY = "Qt5 multimedia examples"
DESCRIPTION = "Examples for the libqt5-qtmultimedia module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtmultimedia-examples-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "94e5efaaba66c9df8bf335e0da584759cf3829252543d8e439a9ba66a4e7d19a35ccd62994b2579f73a76a06a888ac5d14907f883e48d01de2e5c3208a372fdf"

RPROVIDES:${PN} += "libqt5-qtmultimedia-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-QtAudioEngine.1 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
