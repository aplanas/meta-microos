SUMMARY = "Telepathy chat handler by KDE"
DESCRIPTION = "Includes KDE's implementation of the Telepathy chat handler, \
a chat plasmoid, and a chat log viewer application."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-text-ui-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ca1317655f6d101680134a9419c42d695f863b628651d7568bb2632c7226be977e2065be6197aecff8d5c710fddcdd24744f3c6caebfb2cfeebc2da124f19bf9"

RPROVIDES:${PN} += "ktp-text-ui \
ktp-text-ui5 \
libktpchat.so \
libktpimagesharer.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5Emoticons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5People.so.5 \
libKF5PeopleWidgets.so.5 \
libKF5Service.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKTpCommonInternals.so.9 \
libKTpLogger.so.9 \
libKTpModels.so.9 \
libKTpOTR.so.9 \
libKTpWidgets.so.9 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtelepathy-qt5.so.0 \
telepathy-logger"

inherit rpm
