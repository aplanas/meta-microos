SUMMARY = "Plasma applet and services for creating encrypted vaults"
DESCRIPTION = "Plasma Vault is a plasmoid for creating and managing encrypted vaults"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma-vault-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "7e379e6e34a5e9075e16b4b19658a15acf9642bcd74eb35ace0f2a3ddfdb4bed4f10741c93b8093370b54527899df886a1be1912e860771891d38f72e038773d"

RPROVIDES:${PN} += "plasma-vault"

RDEPENDS:${PN} += "/usr/bin/fusermount \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5Plasma.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libprocesscore.so.9 \
libstdc++.so.6 \
plasma-vault-backend \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
