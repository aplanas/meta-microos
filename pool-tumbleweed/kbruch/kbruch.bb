SUMMARY = "Application to excercise fractions"
DESCRIPTION = "KBruch is an application to learn calculating with fractions."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kbruch-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3c58354d1a1ff99c8fc507c89904a5c97fa0ef332d08cadcd8441b508eab879805262536862f8e371746b1f2a7a39d18ef380d5034e383816f2ec689b18ca0ad"

RPROVIDES:${PN} += "kbruch \
kbruch5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
