SUMMARY = "A sddm control module for KDE"
DESCRIPTION = "SDDM control module for KDE. It provides a graphical frontend for the \
sddm."
LICENSE = "GPL-2.0-only"

PV = "5.27.7"

RPM_NAME = "kcm_sddm-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "85ebe917589ec81f32383842520e0cd77f01781c340934f1c19140376f71cf4596ba3ef66e10e6084e9764b39e027aa92dee93565593d26a8246adb3bb287b02"

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
