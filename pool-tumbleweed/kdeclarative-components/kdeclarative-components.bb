SUMMARY = "KDeclarative QML components"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdeclarative-components-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "edaeb3756f0f3b1e09d2a4e20661300f61470928ef7442636855eddb859df6224ec99b9e30146bc471ae44d0989fb6afa70f9b5285a859d0e6a9aaab959e3d56"

RPROVIDES:${PN} += "kdeclarative-components \
kdeclarative-components(aarch-64) \
libdraganddropplugin.so()(64bit) \
libkcmcontrolsplugin.so()(64bit) \
libkconfigplugin.so()(64bit) \
libkcoreaddonsplugin.so()(64bit) \
libkio.so()(64bit) \
libkquickcontrolsaddonsplugin.so()(64bit) \
libkquickcontrolsprivateplugin.so()(64bit) \
libkwindowsystem.so()(64bit) \
qt5qmlimport(org.kde.draganddrop.1) \
qt5qmlimport(org.kde.draganddrop.2) \
qt5qmlimport(org.kde.graphicaleffects.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kcm.private.1) \
qt5qmlimport(org.kde.kconfig.1) \
qt5qmlimport(org.kde.kcoreaddons.1) \
qt5qmlimport(org.kde.kio.1) \
qt5qmlimport(org.kde.kquickcontrols.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.1) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.kwindowsystem.1) \
qt5qmlimport(org.kde.private.kquickcontrols.2)"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libepoxy.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kcm.private.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.private.kquickcontrols.2)"

inherit rpm
