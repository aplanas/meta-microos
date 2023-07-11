SUMMARY = "Geography Trainer"
DESCRIPTION = "KGeography is a geography learning program."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kgeography-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ae17ecfef489c6303aeb406d977b161f32ddc0993f91668c99305643ddf4c03155723f3cfc8bf9c10e2978b12c88d822c40d3fea031c5c0110a4a8a26104d4b5"

RPROVIDES:${PN} += "kgeography \
kgeography5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
