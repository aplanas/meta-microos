SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kalzium-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1fcf9f561ba8f8092a5340639cc6280976885ca63020e1baf0bf9e9ff5a1bfd74d0c8504da654db18ccb53f95380670a3b0e8a5257364dbdb393eeb8d927509f"

RPROVIDES:${PN} += "kalzium \
libscience.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Plotting.so.5 \
libKF5TextWidgets.so.5 \
libKF5UnitConversion.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libopenbabel.so.7 \
libstdc++.so.6"

inherit rpm
