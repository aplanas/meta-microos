SUMMARY = "Plasma Nano"
DESCRIPTION = "A minimal plasma shell package intended for embedded devices"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-nano-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "3bbf272daa3349842414c8daf079575463861147f438c069b816ca4c87291a9a13fb32cb60447cddc29a692051f865fdc6c977fc0aa12907c04395af0c1b40b4"

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
