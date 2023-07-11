SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze style, color-scheme and aditional assets."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "breeze5-style-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "7f3bd2cfa0d6d97e05b8b3d2600b6612ecd1b00cb8d63b39ba2b2d27ba699f2f358d38aceb47a90d847e6f067ece435637d184a1080a8d781b0988178975b730"

RPROVIDES:${PN} += "breeze5-style \
cmake-Breeze"

RDEPENDS:${PN} += "kconf-update5 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KCMUtils.so.5 \
libKF5Kirigami2.so.5 \
libKF5Style.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libbreezecommon5.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
