SUMMARY = "Lightly kdecoration theme"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic. \
 \
This package contains the kdecoration theme of Lightly."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "lightly-decoration-0.4.1-2.7.aarch64.rpm"
RPM_HASH = "3a86a82e127f0257f8db68f1a60dc83a418f514c12bc2b149c0886b2f91be239772dce2cc935c8404b011c270295f242efcdc65dd24b1b075075a308ac8eeb1c"

RPROVIDES:${PN} += "lightly-decoration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libkdecorations2.so.5 \
liblightlycommon5.so.5 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
