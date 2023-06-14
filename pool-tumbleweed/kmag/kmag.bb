SUMMARY = "Screen Magnifier"
DESCRIPTION = "Magnifies a part of the screen."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kmag-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0d4c93a9b3ff6b68d03b2ebc6c747245845ac166821e72156f7fdaedfca26ae0c9370e3540ee959332456e04c72d2af0d0d948f9581ef4484beb0cb7f0a98712"

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
