SUMMARY = "Color Chooser"
DESCRIPTION = "This is an color chooser application by KDE."
LICENSE = "MIT"

PV = "23.04.3"

RPM_NAME = "kcolorchooser-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e9b44201db99cd03434486886395c213ea9415c6bc49ca5957740cc1ef11aebfa235c41311fb42119733d2fe4368dca3f2c971cfc873a849f8afc89d46760f89"

RPROVIDES:${PN} += "kcolorchooser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
