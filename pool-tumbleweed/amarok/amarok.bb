SUMMARY = "Media Player"
DESCRIPTION = "Amarok is a media player for all kinds of media. This includes MP3, Ogg \
Vorbis, audio CDs, podcasts and streams. Play lists can be stored in \
.m3u or .pls files."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.75git.20230408T114133~7098c192a6"

RPM_NAME = "amarok-2.9.75git.20230408T114133~7098c192a6-1.4.aarch64.rpm"
RPM_HASH = "714602ceac67113ac0e5d5048e29651c760a76837edb1bb8a4f3920bc396ea8af2976bc7968609c997af6e9090895087fd6bf5c8eebeaeb34bfaebf7257616c4"

RPROVIDES:${PN} += "amarok \
libamarok-context-applet-albums.so \
libamarok-context-applet-analyzer.so \
libamarok-context-applet-currenttrack.so \
libamarok-context-applet-lyrics.so \
libamarok-context-applet-photos.so \
libamarok-context-applet-wikipedia.so \
libamarok-service-lastfm-config.so \
libamarok-sqlcollection.so.1 \
libamarok-transcoding.so.1 \
libamarokcore.so.1 \
libamaroklib.so.1 \
libamarokpud.so \
libamarokshared.so.1 \
libampache-account-login.so \
libgpodder-service-config.so \
libqml-plugin.so \
qt5qmlimport-org.kde.amarok.albums.1 \
qt5qmlimport-org.kde.amarok.analyzer.1 \
qt5qmlimport-org.kde.amarok.currenttrack.1 \
qt5qmlimport-org.kde.amarok.lyrics.1 \
qt5qmlimport-org.kde.amarok.photos.1 \
qt5qmlimport-org.kde.amarok.qml.1 \
qt5qmlimport-org.kde.amarok.wikipedia.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Attica.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5Declarative.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libfftw3.so.3 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
liblastfm5.so.1 \
libm.so.6 \
libmariadb.so.3 \
libmariadbd.so.19 \
libmtp.so.9 \
libmygpo-qt5.so.1 \
libofa.so.0 \
libphonon4qt5.so.4 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
libtag-extras.so.1 \
libtag-extras1 \
libtag.so.1 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-org.kde.amarok.albums.1 \
qt5qmlimport-org.kde.amarok.analyzer.1 \
qt5qmlimport-org.kde.amarok.currenttrack.1 \
qt5qmlimport-org.kde.amarok.lyrics.1 \
qt5qmlimport-org.kde.amarok.photos.1 \
qt5qmlimport-org.kde.amarok.qml.1 \
qt5qmlimport-org.kde.amarok.wikipedia.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
