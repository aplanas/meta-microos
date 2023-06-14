SUMMARY = "A sddm control module for KDE"
DESCRIPTION = "SDDM control module for KDE. It provides a graphical frontend for the \
sddm."
LICENSE = "GPL-2.0-only"

PV = "5.27.5"

RPM_NAME = "kcm_sddm-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "459d4239903cc74b58452fe1423ec984a86d5037651f0177a635ada95a1710e5ba6a50d89ff9d75bf11fddb42456b6f16f6d804cf46985a94211ad48390016ba"

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
