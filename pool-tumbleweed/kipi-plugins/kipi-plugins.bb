SUMMARY = "KDE Plug-Ins for Image Manipulation"
DESCRIPTION = "A set of plug-ins for the KDE KIPI interface, used by some KDE imaging \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kipi-plugins-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9dd5a4675fd975912fa8d84b91d7c1e0fe0608b8f1017263e3c52aa98d913522eb39ba6b7bba8ac6c986651d2b5510a82c55bf6053faa5e76b9111a2ca2c7563"

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
