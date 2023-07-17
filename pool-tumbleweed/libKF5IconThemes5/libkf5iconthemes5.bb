SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5IconThemes5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e991280870f5eb2c07d50588699620cb28f6fea4991acdeeb6eab2edde81f2ef471a7244e19c384f71265c5e834d188d1d4b3ac2f039aa890179e4e5bc84115a"

RPROVIDES:${PN} += "libKF5IconThemes.so.5 \
libKF5IconThemes5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
