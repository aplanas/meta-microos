SUMMARY = "Color Chooser"
DESCRIPTION = "This is an color chooser application by KDE."
LICENSE = "MIT"

PV = "23.04.1"

RPM_NAME = "kcolorchooser-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c9c350ed30d7ed1299e63870898b43b9b20965837026edb1315c5997e8baf74913d61dffb5dacb171dc870e15a120c2a8c70be70f51a4849873d2941055783df"

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
