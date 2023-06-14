SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "breeze5-decoration-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "7191930549d03b919be080b18865ddf87b2d54b8ae0294ec4011d82e6fa023e2561476d8b7252c226bb4e51f65f50a837ced8405e3053ba14ffb8c35f07d525a"

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
