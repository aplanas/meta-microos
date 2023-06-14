SUMMARY = "Telepathy presence applet"
DESCRIPTION = "This package provides a Plasma applet to launch your Telepathy contacts list."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-desktop-applets-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0f5b3f7155f641a849cf0aba41c94f50ee5fb753e69bed6d82dd07c6ff4e9284bfe73a4f80e350c830ea8de00cfaec52c3440cb57b7808f49e49e1172e92837b"

RPROVIDES:${PN} += "ktp-contact-applet \
ktp-desktop-applets \
ktp-desktop-applets5 \
ktp-presence-applet \
libktpchatplugin.so \
libktpcontactlistplugin.so \
qt5qmlimport-org.kde.ktpchat.0 \
qt5qmlimport-org.kde.ktpcontactlist.0"

RDEPENDS:${PN} += "ktp-common-internals \
ld-linux-aarch64.so.1 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.ktpchat.0 \
qt5qmlimport-org.kde.ktpcontactlist.0 \
qt5qmlimport-org.kde.people.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.telepathy.0"

inherit rpm
