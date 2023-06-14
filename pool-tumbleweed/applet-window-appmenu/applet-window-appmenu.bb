SUMMARY = "Plasma 5 applet to show the window appmenu"
DESCRIPTION = "This is a Plasma 5 applet that shows the current window appmenu in \
one's panels (as a global menu). This plasmoid supports both \
latte-dock and standard Plasma panels."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "applet-window-appmenu-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "016b60f24b579791f11a1cf038782db00df71eda9ebf0770720acc493bbf66a3d8b66da01b8833bed04ccdd7555071f32d17eb719f5a845af6ca04093ad97772"

RPROVIDES:${PN} += "applet-window-appmenu \
libappmenuplugin.so \
qt5qmlimport-org.kde.private.windowAppMenu.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Plasma.so.5 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtaskmanager.so.6 \
libxcb.so.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.private.windowAppMenu.0 \
qt5qmlimport-org.kde.taskmanager.0"

inherit rpm
