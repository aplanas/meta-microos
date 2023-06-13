SUMMARY = "Take photographs with a webcam and an animated interface"
DESCRIPTION = "Kamerka is a Qt5 application using KF5 libraries. It uses \
Video4Linux to get an image from the webcam and is able to save \
photographs. The interface is based on QML and uses its \
possibilities to show an animated UI."
LICENSE = "GPL-2.0-or-later"

PV = "0.20"

RPM_NAME = "kamerka-0.20-1.11.aarch64.rpm"
RPM_HASH = "0aafe838bbca4fe03ce7ce6e29ce63d1d7203e430cf598190b9708a9c13b1eac32b2ad061d4b46e1121226c7a06cb7a7acccbe3168539539027537b6f5056005"

RPROVIDES:${PN} += "application() \
application(kamerka.desktop) \
kamerka \
kamerka(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDELibs4Support.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libphonon4qt5.so.4()(64bit) \
libqimageblitz5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libv4l2.so.0()(64bit) \
libv4lconvert.so.0()(64bit) \
phonon4qt5-backend"

inherit rpm
