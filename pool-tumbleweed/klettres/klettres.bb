SUMMARY = "Alphabet Learning Game"
DESCRIPTION = "Helps to learn the alphabet and read some syllables."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "klettres-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a2a4277b5ff3351a8ac949803b2a51ed3db188cf45d2e6d30eaa71664a76d5b345278896e839c1a8ac75c1f0453296941940509a8241e283ab2f235f5e050adc"

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
