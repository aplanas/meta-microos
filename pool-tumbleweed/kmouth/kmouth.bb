SUMMARY = "Speech Synthesizer Frontend"
DESCRIPTION = "The computer 'speaks' the entered text for talking with people."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmouth-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3b07af5d5d50d40609e654791522abd39424feea85a2c9d7595306f0febac82b0c73db5e07f7106c670c24a5e5e7316d593f1454c3f5db875ddb9b7f4db02c7a"

RPROVIDES:${PN} += "config-kmouth \
kde4-kmouth \
kmouth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
