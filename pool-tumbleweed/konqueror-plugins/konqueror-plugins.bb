SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "These plugins extend the functionality of Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konqueror-plugins-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "32f76f20bf1eed10ad60002d12b0c852077847dc062ccc2ad5b4bd1c4025819ec14282cb8b7681986f965dd8abbfeb1c6dfd59eb2bd24b314609ee16088462cb"

RPROVIDES:${PN} += "config-konqueror-plugins \
fsview5 \
konqueror-plugins \
konqueror5-plugins \
libkonqsidebarplugin.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
konqueror \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Konq.so.6 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Su.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkonquerorprivate.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
