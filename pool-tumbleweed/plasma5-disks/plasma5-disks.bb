SUMMARY = "Plasma service for monitoring disk health"
DESCRIPTION = "Monitors S.M.A.R.T. capable devices for imminent failure and informs the user."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "plasma5-disks-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "0b4f28901099d52383a4a16e41c61f332e7f17b5c36614ebcbf19e794209dc0dd0d6b12179f816fd86647de1198594fb185c8f1e05c7639f791fb57251d104b9"

RPROVIDES:${PN} += "plasma-disks \
plasma5-disks"

RDEPENDS:${PN} += "/usr/sbin/smartctl \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
