SUMMARY = "KDE interfaces and session daemon to colord"
DESCRIPTION = "Colord-kde provides KCM module and KDE daemon module for colord support."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "colord-kde-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "87fe6c354e00846d3ab4eb9db0489aa24952d6faa3ec4c073dfd0696007082a71f963ec91591bce410eaa1e36b88264bcff1b5c6a8a99779e9e35833cac0e979"

RPROVIDES:${PN} += "colord-kde"

RDEPENDS:${PN} += "colord \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5QuickAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigamiaddons.treeview.1 \
qt5qmlimport-org.kde.kitemmodels.1"

inherit rpm
