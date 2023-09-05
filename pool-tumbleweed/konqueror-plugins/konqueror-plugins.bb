SUMMARY = "KDE File Manager and Browser"
DESCRIPTION = "These plugins extend the functionality of Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konqueror-plugins-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7fbf0a75e4a9798b80e5e3b9558ab3c2c9eafe997711cbcf047dbeef1c343f55c352976e403665d959b4e9c136c7ff75427895a97a0ddfd4982d189b4f5831dd"

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
libkwebenginepart.so \
libm.so.6 \
libstdc++.so.6"

inherit rpm
