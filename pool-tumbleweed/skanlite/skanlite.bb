SUMMARY = "Image Scanner Application"
DESCRIPTION = "Skanlite is an image scanner application by KDE."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "skanlite-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ac5cf929877c3a4a3103ed3028297badf4cc550707a1c86510e220fcb206a807ba0903e7e8cf64bf13256a3f3ea1186ce9a4c7e9fae63dcdcd303389683e2887"

RPROVIDES:${PN} += "skanlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Sane.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
