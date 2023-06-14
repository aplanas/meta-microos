SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dolphin-part-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7727451971162b6f0b095c9fecf40ab0b6547af7cd11e73e4fb505c18ffaa55b6e55e36becf16e2e1d6309c89c4bb30d2280821ddd6bc6e88d23d05a0def9874"

RPROVIDES:${PN} += "dolphin-part \
libdolphinprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kio \
ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5BalooWidgets.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5Parts.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdolphinvcs.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
