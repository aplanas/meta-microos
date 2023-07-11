SUMMARY = "Rocket.chat Client"
DESCRIPTION = "Ruqola is a Rocket.Chat client for the KDE desktop. \
 \
It supports multi-account, search in room, open close rooms, direct message, thread, discussions. \
RC settings can be changed directly. \
 \
It's a native alternative to the official embedded browser type of desktop app available from Rocket.Chat project."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "ruqola-1.9.1-2.2.aarch64.rpm"
RPM_HASH = "91e5b24829d16eccd99aeb2076981b9c6c9b8f301654010990b7b674ce2f43e95d7345805e1f4831549b5e476832959ae554fc1bdbfab74e0f6a31b8ded6dcd2"

RPROVIDES:${PN} += "librocketchatrestapi-qt5.so.0 \
libruqola-autocorrection.so.0 \
libruqola-texttospeech.so.0 \
libruqola-texttranslator.so.0 \
libruqolacore.so.0 \
libruqolawidgets.so.0 \
ruqola"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Prison.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5SonnetUi.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
