SUMMARY = "Plasma Nano"
DESCRIPTION = "A minimal plasma shell package intended for embedded devices"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-nano-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "2e06171b7efb9475ee175c0f74674d847507cc1685e9b4da00cc8eda8f2df27b619b3325456199d1d67eda90bfb699e6969b5d58d048d51c54b39f2990dc7bf3"

RPROVIDES:${PN} += "libplasmananoshellprivateplugin.so \
plasma5-nano \
qt5qmlimport-org.kde.plasma.private.nanoshell.2"

RDEPENDS:${PN} += "kdeclarative-components \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libqt5-qtgraphicaleffects \
libstdc++.so.6 \
plasma-framework-components \
plasma5-workspace \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.nanoshell.2 \
qt5qmlimport-org.kde.plasma.private.shell.2 \
qt5qmlimport-org.kde.plasma.wallpapers.image.2"

inherit rpm
