SUMMARY = "Rocket.chat Client"
DESCRIPTION = "Ruqola is a Rocket.Chat client for the KDE desktop. \
 \
It supports multi-account, search in room, open close rooms, direct message, thread, discussions. \
RC settings can be changed directly. \
 \
It's a native alternative to the official embedded browser type of desktop app available from Rocket.Chat project."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "ruqola-1.9.1-2.1.aarch64.rpm"
RPM_HASH = "2cd815858f3bad681f0b4bb3864b49a7dc973c4cfd91a5b1ff3eec43053df7b0d8e4184f74aa27edff6ce289687d6ab7f1a95add7cced6bcb9100cce02781b0c"

RPROVIDES:${PN} += "application() \
application(org.kde.ruqola.desktop) \
librocketchatrestapi-qt5.so.0()(64bit) \
libruqola-autocorrection.so.0()(64bit) \
libruqola-texttospeech.so.0()(64bit) \
libruqola-texttranslator.so.0()(64bit) \
libruqolacore.so.0()(64bit) \
libruqolawidgets.so.0()(64bit) \
metainfo() \
metainfo(org.kde.ruqola.appdata.xml) \
ruqola \
ruqola(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IdleTime.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Prison.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKUserFeedbackCore.so.1()(64bit) \
libKUserFeedbackWidgets.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5MultimediaWidgets.so.5()(64bit) \
libQt5MultimediaWidgets.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
