SUMMARY = "Kirigami-based podcast player"
DESCRIPTION = "Kasts is a convergent podcast application. \
Its main features are: \
 \
- Episode management through play queue \
- Sync playback positions with other clients through gpodder.net or \
  gpodder-nextcloud \
- Variable playback speed \
- Search for podcasts \
- Full system integration: e.g. inhibit system suspend while listening"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kasts-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "074af4056eb50eadc19dc5f8754f5103af3b9bf56909b126988ffabc4e9cbf3b2f34b74a7245ebffdda40457a66e958d9475e100d7a1f82ef1718ab6f9e6f72b"

RPROVIDES:${PN} += "kasts \
libKMediaSession.so \
libKastsSolidExtras.so \
libkasts-solidextrasqmlplugin.so \
libkmediasession-qmlplugin.so \
qt5qmlimport-org.kde.kasts.solidextras.1 \
qt5qmlimport-org.kde.kmediasession.1"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5Syndication.so.5 \
libKF5ThreadWeaver.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5keychain.so.1 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
