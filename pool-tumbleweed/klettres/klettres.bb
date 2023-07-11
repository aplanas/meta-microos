SUMMARY = "Alphabet Learning Game"
DESCRIPTION = "Helps to learn the alphabet and read some syllables."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "klettres-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4311a1ef6c021880e1e5c736d617117a4212afb54435f52504eb1d64f093c7ee8097462967ff0b18a6b523d51843cff6835b73a41113c47b078bd5da0a5e64b3"

RPROVIDES:${PN} += "klettres \
klettres5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
