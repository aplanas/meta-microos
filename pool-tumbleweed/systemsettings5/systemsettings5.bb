SUMMARY = "KDE's control center"
DESCRIPTION = "This package provides modules to control settings of Plasma and other \
applications by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "systemsettings5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "b655a1468c05dad99d907834b040334ca747dd42a00ea745516294cee1ea2a3641db9229505425bbfaf394ca0b8d31f88cb634ab66efb03346bc06c54e09f66c"

RPROVIDES:${PN} += "libsystemsettingsview.so.3 \
qt5qmlimport-org.kde.systemsettings.1 \
systemsettings5 \
systemsettings5-zsh-completion"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Auth.so.5 \
libKF5AuthCore.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Kirigami2.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Runner.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkworkspace5.so.5 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.systemsettings.1"

inherit rpm
