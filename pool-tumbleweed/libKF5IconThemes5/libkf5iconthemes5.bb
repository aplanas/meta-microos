SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5IconThemes5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9e52a665a3fd4ced7c6244a75ada40c4567ca17650e4440e157b2f0c8c7c2b7f11d535f23983de1865a5e0466cb48adcfa7334bfaadad96444f66ad5b6918e4c"

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
