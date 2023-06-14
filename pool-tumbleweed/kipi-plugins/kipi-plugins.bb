SUMMARY = "KDE Plug-Ins for Image Manipulation"
DESCRIPTION = "A set of plug-ins for the KDE KIPI interface, used by some KDE imaging \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kipi-plugins-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "dddcc008b2a4db25ba78ada45c80f45b4fe941d525c18186ff0354d22cd9e8ee0e13b496a5c31f5a0184faa92d9c5b1ec9be082531170f0e7e99565319bb5056"

RPROVIDES:${PN} += "kipi-plugin-icons \
kipi-plugins \
kipi-plugins5 \
libKF5kipiplugins.so.5.9.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Kipi.so.32.0.0 \
libKF5MediaWiki.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
