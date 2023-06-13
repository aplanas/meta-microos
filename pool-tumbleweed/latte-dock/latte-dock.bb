SUMMARY = "Replacement Dock for Plasma Desktops"
DESCRIPTION = "Latte is an alternative application launcher and dock for Plasma. \
It animates its contents by using a parabolic zoom effect and tries to be there only when it is needed."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.0~20220619T183501"

RPM_NAME = "latte-dock-0.11.0~20220619T183501-1.4.aarch64.rpm"
RPM_HASH = "68a24656988581c5ab46c862ce5c96d3ec7ea88a1e39c1409186901694c8bb0ee52a1a3d00a48f5a762b068c298f40ae897fe7c866d8c65a1abffc1ec538d44b"

RPROVIDES:${PN} += "application() \
application(org.kde.latte-dock.desktop) \
latte-dock \
latte-dock(aarch-64) \
liblattecontainmentplugin.so()(64bit) \
liblattecoreplugin.so()(64bit) \
liblattetasksplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.latte-dock.appdata.xml) \
metainfo(org.kde.latte.plasmoid.appdata.xml) \
metainfo(org.kde.latte.shell.appdata.xml) \
qt5qmlimport(org.kde.latte.abilities.bridge.0) \
qt5qmlimport(org.kde.latte.abilities.client.0) \
qt5qmlimport(org.kde.latte.abilities.definition.0) \
qt5qmlimport(org.kde.latte.abilities.host.0) \
qt5qmlimport(org.kde.latte.abilities.items.0) \
qt5qmlimport(org.kde.latte.components.1) \
qt5qmlimport(org.kde.latte.core.0) \
qt5qmlimport(org.kde.latte.private.containment.0) \
qt5qmlimport(org.kde.latte.private.tasks.0)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5PlasmaQuick.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WaylandClient.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb.so.1()(64bit) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Controls.Styles.Plasma.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Templates.2) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.activities.0) \
qt5qmlimport(org.kde.draganddrop.2) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.kwindowsystem.1) \
qt5qmlimport(org.kde.latte.abilities.bridge.0) \
qt5qmlimport(org.kde.latte.abilities.client.0) \
qt5qmlimport(org.kde.latte.abilities.definition.0) \
qt5qmlimport(org.kde.latte.abilities.host.0) \
qt5qmlimport(org.kde.latte.abilities.items.0) \
qt5qmlimport(org.kde.latte.components.1) \
qt5qmlimport(org.kde.latte.core.0) \
qt5qmlimport(org.kde.latte.private.containment.0) \
qt5qmlimport(org.kde.latte.private.tasks.0) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.configuration.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
qt5qmlimport(org.kde.plasma.private.shell.2) \
qt5qmlimport(org.kde.plasma.private.taskmanager.0) \
qt5qmlimport(org.kde.plasma.private.volume.0) \
qt5qmlimport(org.kde.taskmanager.0)"

inherit rpm
