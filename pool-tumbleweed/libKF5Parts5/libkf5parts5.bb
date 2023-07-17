SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Parts5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e73b2d9c6e1e78f3cceab1607cb5e19a53e54dd8da4b54af7530e372cc966bd38c9f993f9e113eb30be54fcf43c9ba9e6f69638398f80e4a4467f7fdb9703929"

RPROVIDES:${PN} += "libKF5Parts.so.5 \
libKF5Parts5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
