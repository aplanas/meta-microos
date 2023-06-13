SUMMARY = "Media Player"
DESCRIPTION = "Amarok is a media player for all kinds of media. This includes MP3, Ogg \
Vorbis, audio CDs, podcasts and streams. Play lists can be stored in \
.m3u or .pls files."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.75git.20230408T114133~7098c192a6"

RPM_NAME = "amarok-2.9.75git.20230408T114133~7098c192a6-1.2.aarch64.rpm"
RPM_HASH = "14787b6fd2b2991748976b4531592ad48557a9d5dff773ceaafb51bf932387ce3de8828710b1a75b7b2b75b795273288b4b65390ea0fb20478c4902d15195edd"

RPROVIDES:${PN} += "amarok \
amarok(aarch-64) \
application() \
application(org.kde.amarok.desktop) \
application(org.kde.amarok_containers.desktop) \
libamarok-sqlcollection.so.1()(64bit) \
libamarok-transcoding.so.1()(64bit) \
libamarok_context_applet_albums.so()(64bit) \
libamarok_context_applet_analyzer.so()(64bit) \
libamarok_context_applet_currenttrack.so()(64bit) \
libamarok_context_applet_lyrics.so()(64bit) \
libamarok_context_applet_photos.so()(64bit) \
libamarok_context_applet_wikipedia.so()(64bit) \
libamarok_service_lastfm_config.so()(64bit) \
libamarokcore.so.1()(64bit) \
libamaroklib.so.1()(64bit) \
libamarokpud.so()(64bit) \
libamarokshared.so.1()(64bit) \
libampache_account_login.so()(64bit) \
libgpodder_service_config.so()(64bit) \
libqml_plugin.so()(64bit) \
metainfo() \
metainfo(org.kde.amarok.albums.appdata.xml) \
metainfo(org.kde.amarok.analyzer.appdata.xml) \
metainfo(org.kde.amarok.appdata.xml) \
metainfo(org.kde.amarok.context.appdata.xml) \
metainfo(org.kde.amarok.currenttrack.appdata.xml) \
metainfo(org.kde.amarok.lyrics.appdata.xml) \
metainfo(org.kde.amarok.photos.appdata.xml) \
metainfo(org.kde.amarok.wikipedia.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-ogm-audio) \
mimehandler(audio/aac) \
mimehandler(audio/flac) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-oggflac) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(video/x-ms-asf) \
qt5qmlimport(org.kde.amarok.albums.1) \
qt5qmlimport(org.kde.amarok.analyzer.1) \
qt5qmlimport(org.kde.amarok.currenttrack.1) \
qt5qmlimport(org.kde.amarok.lyrics.1) \
qt5qmlimport(org.kde.amarok.photos.1) \
qt5qmlimport(org.kde.amarok.qml.1) \
qt5qmlimport(org.kde.amarok.wikipedia.1)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Attica.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5DNSSD.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5ThreadWeaver.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libavcodec.so.59()(64bit) \
libavformat.so.59()(64bit) \
libavutil.so.57()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpod.so.4()(64bit) \
liblastfm5.so.1()(64bit) \
libm.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libmariadbd.so.19()(64bit) \
libmtp.so.9()(64bit) \
libmygpo-qt5.so.1()(64bit) \
libofa.so.0()(64bit) \
libphonon4qt5.so.4()(64bit) \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libtag-extras.so.1()(64bit) \
libtag-extras1 \
libtag.so.1()(64bit) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtWebEngine.1) \
qt5qmlimport(org.kde.amarok.albums.1) \
qt5qmlimport(org.kde.amarok.analyzer.1) \
qt5qmlimport(org.kde.amarok.currenttrack.1) \
qt5qmlimport(org.kde.amarok.lyrics.1) \
qt5qmlimport(org.kde.amarok.photos.1) \
qt5qmlimport(org.kde.amarok.qml.1) \
qt5qmlimport(org.kde.amarok.wikipedia.1) \
qt5qmlimport(org.kde.kirigami.2)"

inherit rpm
