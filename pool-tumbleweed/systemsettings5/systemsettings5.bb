SUMMARY = "KDE's control center"
DESCRIPTION = "This package provides modules to control settings of Plasma and other \
applications by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "systemsettings5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "8c73a57ad20cc0acaba43d2c0da29ccb35de76944f8503d48e7bad632d704de6e02ce6ef54eba8f890346f89d51b73d8d36da5c42787d3856a0fb2773f97507d"

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
