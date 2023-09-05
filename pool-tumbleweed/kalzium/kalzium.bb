SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalzium-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ba89ffaf4085bb0f31cff3fddd46d8f26d83a411d088d06f43f5dff6034f9ced78aeceb18c7df204628ae24ea2c489b9af228e1e2d5927044843cb8042fe378a"

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
