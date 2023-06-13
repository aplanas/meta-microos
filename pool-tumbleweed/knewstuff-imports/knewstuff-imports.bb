SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knewstuff-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fe30e3378b3b6d65f50c379c5ba8f85e9f4fa3b41407d741d4f8bf17ffec2c2d50da13ca832d176022ac7ac1db0d2297f41f96de6cdacb6bed3af38e6d28e72d"

RPROVIDES:${PN} += "knewstuff-imports \
knewstuff-imports(aarch-64) \
libnewstuffqmlplugin.so()(64bit) \
qt5qmlimport(org.kde.newstuff.1) \
qt5qmlimport(org.kde.newstuff.core.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.newstuff.1) \
qt5qmlimport(org.kde.newstuff.core.1)"

inherit rpm
