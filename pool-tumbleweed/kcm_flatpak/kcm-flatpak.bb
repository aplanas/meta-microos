SUMMARY = "Flatpak Permissions Management KCM"
DESCRIPTION = "The KCM allows changing what permissions have been granted to installed Flatpak applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kcm_flatpak-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "1801100a3a27306acdd6c280702489bce6ce2d00caa5da5979a68d794f7bc8ba1346731822e8cd9c534765e770d0ac98dc757fe43ae0c7686a63e2517e11c4e8"

RPROVIDES:${PN} += "kcm-flatpak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
systemsettings5"

inherit rpm
