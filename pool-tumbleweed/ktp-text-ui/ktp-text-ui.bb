SUMMARY = "Telepathy chat handler by KDE"
DESCRIPTION = "Includes KDE's implementation of the Telepathy chat handler, \
a chat plasmoid, and a chat log viewer application."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-text-ui-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fd7cc294507e2b1f30ef732f3c535f927b233cf00affa54247d19e39956e1560dbf0a0430240a1d9eb1bec5deef6879579d044b51cc9a557a3c15a5b55dd1d15"

RPROVIDES:${PN} += "application() \
application(org.kde.ktplogviewer.desktop) \
ktp-text-ui \
ktp-text-ui(aarch-64) \
ktp-text-ui5 \
libktpchat.so()(64bit) \
libktpimagesharer.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5Emoticons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5People.so.5()(64bit) \
libKF5PeopleWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKTpCommonInternals.so.9()(64bit) \
libKTpLogger.so.9()(64bit) \
libKTpModels.so.9()(64bit) \
libKTpOTR.so.9()(64bit) \
libKTpWidgets.so.9()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtelepathy-qt5.so.0()(64bit) \
telepathy-logger"

inherit rpm
