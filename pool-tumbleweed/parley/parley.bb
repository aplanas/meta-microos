SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "Parley is a vocabulary trainer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "parley-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3116827de6485b81e6bf8f332576d14d05356979242f4fd52eaa50961cefcf91828d95af7019dcf9d9c212bf8a2c216fb3e2e2504dedcae113cb450abfff282f"

RPROVIDES:${PN} += "parley \
parley5"

RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
