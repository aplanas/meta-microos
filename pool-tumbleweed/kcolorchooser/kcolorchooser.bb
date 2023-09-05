SUMMARY = "Color Chooser"
DESCRIPTION = "This is an color chooser application by KDE."
LICENSE = "MIT"

PV = "23.08.0"

RPM_NAME = "kcolorchooser-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "935c68ce2bdcc9658708623b24f85629987759ac66e46d26c710f6d1096dcf9b407994bc8fc91d43ad092e6419aed597f88b9f9c6a61fb11de9cd8dc7e865827"

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
