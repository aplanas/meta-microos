SUMMARY = "Speech Synthesizer Frontend"
DESCRIPTION = "The computer 'speaks' the entered text for talking with people."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmouth-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "73f7063c8acd2ab8edd9c8739bc22d67b18b0569adf2e3e3efd9e17d3a5e5f6e24ca5d7fb3a78d502b96ac3b0b38de4a107df687ed079c585d3be638040be7b5"

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
