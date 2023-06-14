SUMMARY = "Replacement Dock for Plasma Desktops"
DESCRIPTION = "Latte is an alternative application launcher and dock for Plasma. \
It animates its contents by using a parabolic zoom effect and tries to be there only when it is needed."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.0~20220619T183501"

RPM_NAME = "latte-dock-0.11.0~20220619T183501-1.4.aarch64.rpm"
RPM_HASH = "68a24656988581c5ab46c862ce5c96d3ec7ea88a1e39c1409186901694c8bb0ee52a1a3d00a48f5a762b068c298f40ae897fe7c866d8c65a1abffc1ec538d44b"

RPROVIDES:${PN} += "latte-dock \
liblattecontainmentplugin.so \
liblattecoreplugin.so \
liblattetasksplugin.so \
qt5qmlimport-org.kde.latte.abilities.bridge.0 \
qt5qmlimport-org.kde.latte.abilities.client.0 \
qt5qmlimport-org.kde.latte.abilities.definition.0 \
qt5qmlimport-org.kde.latte.abilities.host.0 \
qt5qmlimport-org.kde.latte.abilities.items.0 \
qt5qmlimport-org.kde.latte.components.1 \
qt5qmlimport-org.kde.latte.core.0 \
qt5qmlimport-org.kde.latte.private.containment.0 \
qt5qmlimport-org.kde.latte.private.tasks.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5Declarative.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5PlasmaQuick.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-randr.so.0 \
libxcb-shape.so.0 \
libxcb.so.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Controls.Styles.Plasma.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.activities.0 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.kwindowsystem.1 \
qt5qmlimport-org.kde.latte.abilities.bridge.0 \
qt5qmlimport-org.kde.latte.abilities.client.0 \
qt5qmlimport-org.kde.latte.abilities.definition.0 \
qt5qmlimport-org.kde.latte.abilities.host.0 \
qt5qmlimport-org.kde.latte.abilities.items.0 \
qt5qmlimport-org.kde.latte.components.1 \
qt5qmlimport-org.kde.latte.core.0 \
qt5qmlimport-org.kde.latte.private.containment.0 \
qt5qmlimport-org.kde.latte.private.tasks.0 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.shell.2 \
qt5qmlimport-org.kde.plasma.private.taskmanager.0 \
qt5qmlimport-org.kde.plasma.private.volume.0 \
qt5qmlimport-org.kde.taskmanager.0"

inherit rpm
