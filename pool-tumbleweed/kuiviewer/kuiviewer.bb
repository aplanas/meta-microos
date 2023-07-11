SUMMARY = "UI Files Viewer"
DESCRIPTION = "Displays Qt Designer UI files"
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kuiviewer-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "affa933511e5df5da0fc10417dbe446397063e2d42f7be038616a01aac027c80ed1ab0ac1050bf34fc811f5d21cec8055acc1ec149ed9d971a0a4cf48ad0e3f2"

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
