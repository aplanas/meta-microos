SUMMARY = "KDE interfaces and session daemon to colord"
DESCRIPTION = "Colord-kde provides KCM module and KDE daemon module for colord support."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "colord-kde-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d4d3cfc62deb240ff5ac268972f79d2cd407f42efa57f22291286ae3cbf386d92ebaff6beb6c076a704137e5ecb912233bdb40a210dae1556f14cae882f56435"

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
