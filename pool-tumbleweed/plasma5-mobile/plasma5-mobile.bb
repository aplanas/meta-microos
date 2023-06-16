SUMMARY = "Plasma Mobile"
DESCRIPTION = "Plasma shell and components targeted for phones."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-mobile-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "ae41d18225e4ba1ad652ab185ecc5a451ba36e0ad49d2d4066dc981f5190d5b20aaef12afa93218b1709b72803150c90ee6b225d586c751613c76d4345f432c3"

RPROVIDES:${PN} += "libflashlightplugin.so \
libmobileshellplugin.so \
libmobileshellstateplugin.so \
libnightcolorplugin.so \
libpowermenuplugin.so \
libppc-mmqmlplugin.so \
librecordplugin.so \
libscreenrotationplugin.so \
libscreenshotplugin.so \
plasma5-mobile \
plasma5-phone-components \
qt5qmlimport-org.kde.plasma.mm.1 \
qt5qmlimport-org.kde.plasma.private.mobileshell.1 \
qt5qmlimport-org.kde.plasma.private.mobileshell.state.1 \
qt5qmlimport-org.kde.plasma.quicksetting.flashlight.1 \
qt5qmlimport-org.kde.plasma.quicksetting.nightcolor.1 \
qt5qmlimport-org.kde.plasma.quicksetting.powermenu.1 \
qt5qmlimport-org.kde.plasma.quicksetting.record.1 \
qt5qmlimport-org.kde.plasma.quicksetting.screenrotation.1 \
qt5qmlimport-org.kde.plasma.quicksetting.screenshot.1"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez-qt-imports \
kactivities5-imports \
kdeclarative-components \
kirigami2 \
kwin5 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5ModemManagerQt.so.6 \
libKF5NetworkManagerQt.so.6 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkworkspace5.so.5 \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libqt5-qtwayland \
libstdc++.so.6 \
milou5 \
plasma-nm5 \
plasma5-nano \
plasma5-pa \
plasma5-workspace \
qqc2-breeze-style \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.bluezqt.1 \
qt5qmlimport-org.kde.colorcorrect.0 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigamiaddons.labs.mobileform.0 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.notificationmanager.1 \
qt5qmlimport-org.kde.pipewire.record.0 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.mm.1 \
qt5qmlimport-org.kde.plasma.networkmanagement.0 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.containmentlayoutmanager.1 \
qt5qmlimport-org.kde.plasma.private.mobileshell.1 \
qt5qmlimport-org.kde.plasma.private.mobileshell.state.1 \
qt5qmlimport-org.kde.plasma.private.nanoshell.2 \
qt5qmlimport-org.kde.plasma.private.sessions.2 \
qt5qmlimport-org.kde.plasma.quicksetting.flashlight.1 \
qt5qmlimport-org.kde.plasma.quicksetting.nightcolor.1 \
qt5qmlimport-org.kde.plasma.quicksetting.powermenu.1 \
qt5qmlimport-org.kde.plasma.quicksetting.record.1 \
qt5qmlimport-org.kde.plasma.quicksetting.screenrotation.1 \
qt5qmlimport-org.kde.plasma.quicksetting.screenshot.1 \
qt5qmlimport-org.kde.plasma.shell.2 \
qt5qmlimport-org.kde.plasma.wallpapers.image.2 \
qt5qmlimport-org.kde.plasma.workspace.keyboardlayout.1 \
qt5qmlimport-org.kde.taskmanager.0"

inherit rpm
