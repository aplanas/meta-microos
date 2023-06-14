SUMMARY = "Plasma Bigscreen"
DESCRIPTION = "Plasma shell for TVs."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-bigscreen-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "3e03535dd9ee505e6b2df05945d90397908df7e300a6a21930a67a73560f698b02b0cd4809e263eea9659d146a881d30f4a428f92eafbb087897bb95536cb135"

RPROVIDES:${PN} += "libbigscreenplugin.so \
plasma5-bigscreen \
qt5qmlimport-org.kde.mycroft.bigscreen.1"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Plasma.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkworkspace5.so.5 \
libstdc++.so.6 \
plasma5-workspace \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kdeconnect.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.mycroft.bigscreen.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.networkmanagement.0 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.digitalclock.1 \
qt5qmlimport-org.kde.plasma.private.kicker.0 \
qt5qmlimport-org.kde.plasma.private.nanoshell.2 \
qt5qmlimport-org.kde.plasma.private.sessions.2 \
qt5qmlimport-org.kde.plasma.private.volume.0 \
qt5qmlimport-org.kde.plasma.wallpapers.image.2"

inherit rpm
