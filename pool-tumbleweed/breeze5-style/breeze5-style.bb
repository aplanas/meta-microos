SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze style, color-scheme and aditional assets."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "breeze5-style-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "6f405960245b3da4ffadc8ee3074b1f970d3cee0331e6eb69c64381cbc5ef802f1263d696e7814728051d8642542926c3f15d508b3a0511a3fbf1de481852489"

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
