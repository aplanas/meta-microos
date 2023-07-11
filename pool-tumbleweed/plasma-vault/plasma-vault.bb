SUMMARY = "Plasma applet and services for creating encrypted vaults"
DESCRIPTION = "Plasma Vault is a plasmoid for creating and managing encrypted vaults"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma-vault-5.27.6-2.1.aarch64.rpm"
RPM_HASH = "19e7a472d85cf84bc2351309d5942485a01edea3e26f976e05d9424a2265b66c3086edf3cb7e11a952c28242fced58beded7f36d36bca155e344796d11603712"

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
