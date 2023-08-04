SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "breeze5-decoration-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a75dcc47fde15c7e056c05a8e86768c232518cdf401e51c39d6bf4cfcc114c834486881667a2b734634652a2b135067cffcb964c0c01db744fafc1d4a4a5b8c2"

RPROVIDES:${PN} += "breeze5-decoration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libbreezecommon5.so.5 \
libc.so.6 \
libkdecorations2.so.5 \
libstdc++.so.6"

inherit rpm
