SUMMARY = "Alphabet Learning Game"
DESCRIPTION = "Helps to learn the alphabet and read some syllables."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "klettres-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "91e7844a10200ad37543f34926f082ac72ccfbf45582be71a7629c521a155385aaa4f0e085962ee9c45c7a338ad27513aae7f72f354e412b399a453b2dbaa6a0"

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
