SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze style, color-scheme and aditional assets."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "breeze5-style-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "f67815a4973b9da77824d8dd782d742c3a2090b1737ba19af861d44784901bccb446c7ae0dcffab14f1541d2da31c87e84fba595cb72a1881b4215c86e60eb4b"

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
