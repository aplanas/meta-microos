SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "breeze5-decoration-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "ff76b1d058d2c6b9fb7fe5eb5408ded034b68b9aa5bb2b05891496ebb6dc8f6df903c18960a21dd05007bb675d5edb3ff8021e27dbf9c96670bebc4986a64324"

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
