SUMMARY = "Plasma Nano"
DESCRIPTION = "A minimal plasma shell package intended for embedded devices"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-nano-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "0a7908fa604e059a42358bd4d5a3577f3529195784010fb99539b41a0e7d95b1f04b41b1df145b0320898c60a0f864a18c0d3506ed77f10902a09a2c7d05b51c"

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
