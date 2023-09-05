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

PV = "23.08.0"

RPM_NAME = "kasts-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c177613ab9f35734fc06f6f69d3e6937c6c64eb4a9462334d0488e436999ab64b5f16445f8cf45f1503c83ec0b368e0d54977d1530f491a79c7ad28c0247f575"

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
