SUMMARY = "Speech Synthesizer Frontend"
DESCRIPTION = "The computer 'speaks' the entered text for talking with people."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmouth-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "638666ebf283de251f4a12dd17042618b1808a725816a6dc1440e573d9a61ad8f0471aafc3ea8bf7c9563ae9598040fd55d43b3a7dc66af45fe077085b52aaf9"

RPROVIDES:${PN} += "application() \
application(org.kde.kmouth.desktop) \
config(kmouth) \
kde4-kmouth \
kmouth \
kmouth(aarch-64) \
metainfo() \
metainfo(org.kde.kmouth.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
