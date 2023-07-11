SUMMARY = "A sddm control module for KDE"
DESCRIPTION = "SDDM control module for KDE. It provides a graphical frontend for the \
sddm."
LICENSE = "GPL-2.0-only"

PV = "5.27.6"

RPM_NAME = "kcm_sddm-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "9a8895fa09e3c7c49a34e4b28e450888d63a6ee3bf2e50ef3acd51e77e7258a12c8d2c593f712d3e2f362f30a004832634d5f24deaae6bb5c46c1cdc8f62a766"

RPROVIDES:${PN} += "kcm-sddm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOGui.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.newstuff.1"

inherit rpm
