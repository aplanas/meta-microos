SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5IconThemes5-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "d6646b388e1f02dbb548710928efe8c551cc11258b19abc3fc7f607fea6bfbb7d4faf8db14be0d77f2716d836cfa8923528987b50206c807bcf6195f8522334e"

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
