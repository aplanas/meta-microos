SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "dolphin-part-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c897781218ce0a502fea18cd211122a63eb4bf3aa782ea04e3080b24120d61b228f88bc6c0627e265912ad184328c6aa6b5a2a662c84bd5a8cdf9118bf3c61fd"

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
