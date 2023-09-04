SUMMARY = "KDeclarative QML components"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdeclarative-components-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5f465b27012b3d005d27ad7890da8485824a531af8d28f208b4d47b04fa18967fb276b49816790e978a5e8a79b099b2190c73232a2ff0c981c82cf568ef775e8"

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
