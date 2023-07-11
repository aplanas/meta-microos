SUMMARY = "Screen Magnifier"
DESCRIPTION = "Magnifies a part of the screen."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kmag-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "56af68f1841797f422d885e0be05b0cb92a1910335b0cf196d2f3208c92c94d6e8cf71811bd75c5f8b4ac971b1263c34d6dd407b730d90da69d4cfe7bb5461dc"

RPROVIDES:${PN} += "kmag \
kmag5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
