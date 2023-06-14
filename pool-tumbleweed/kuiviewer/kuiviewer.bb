SUMMARY = "UI Files Viewer"
DESCRIPTION = "Displays Qt Designer UI files"
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kuiviewer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4b0cf3c4a4c76344cf69c03a4e4b9306284e5305359d85d6b5aee4d6aeb3d63f452aa35de1704231696ed6a2d50d7907263e1914ace9d1838c904a92d93adba4"

RPROVIDES:${PN} += "kuiviewer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
