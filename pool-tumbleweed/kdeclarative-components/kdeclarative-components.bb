SUMMARY = "KDeclarative QML components"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdeclarative-components-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c9e05d9cc4ef89c3d9be0c8e4710bef00d0ca0f899ed204c05233ad0109fb0473f38fc12d0a1ec216f4d7590c0cca9bdf2a3f8c58fc0b6a0dadd9de075a6cff3"

RPROVIDES:${PN} += "kdeclarative-components \
libdraganddropplugin.so \
libkcmcontrolsplugin.so \
libkconfigplugin.so \
libkcoreaddonsplugin.so \
libkio.so \
libkquickcontrolsaddonsplugin.so \
libkquickcontrolsprivateplugin.so \
libkwindowsystem.so \
qt5qmlimport-org.kde.draganddrop.1 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.graphicaleffects.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcm.private.1 \
qt5qmlimport-org.kde.kconfig.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kio.1 \
qt5qmlimport-org.kde.kquickcontrols.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.kwindowsystem.1 \
qt5qmlimport-org.kde.private.kquickcontrols.2"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libepoxy.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcm.private.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.private.kquickcontrols.2"

inherit rpm
