SUMMARY = "Take photographs with a webcam and an animated interface"
DESCRIPTION = "Kamerka is a Qt5 application using KF5 libraries. It uses \
Video4Linux to get an image from the webcam and is able to save \
photographs. The interface is based on QML and uses its \
possibilities to show an animated UI."
LICENSE = "GPL-2.0-or-later"

PV = "0.20"

RPM_NAME = "kamerka-0.20-1.12.aarch64.rpm"
RPM_HASH = "b2b6d2cea4df6257135005160d27d8756a4ef4cfef334f8cc07b2a443c14a63f249c45222ba1d4e63ac513df522b5f6ec21a5ace0ed6b2be87f3884128c0ad4b"

RPROVIDES:${PN} += "kamerka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5KDELibs4Support.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libqimageblitz5.so.1 \
libstdc++.so.6 \
libv4l2.so.0 \
libv4lconvert.so.0 \
phonon4qt5-backend"

inherit rpm
