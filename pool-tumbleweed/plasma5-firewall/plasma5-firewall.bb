SUMMARY = "Config Module for the System Firewall"
DESCRIPTION = "Config Module for the System Firewall"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "plasma5-firewall-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "8c9fe05956a9bfd5efd8dbcc590d119e1c405379cc94b8a81068d766f4ceb9d66bc3d7083510036f71a3a49844e182421a8c5583744d57c4f97792e731b606c5"

RPROVIDES:${PN} += "libkcm-firewall-core.so \
plasma5-firewall"

RDEPENDS:${PN} += "firewalld \
kdeclarative-components \
kirigami2 \
kitemmodels-imports \
knewstuff-imports \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1"

inherit rpm
