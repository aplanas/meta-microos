SUMMARY = "Application to excercise fractions"
DESCRIPTION = "KBruch is an application to learn calculating with fractions."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kbruch-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "de236a4a0edaacc194a5b50bdbe3b92ad74fac784baef84323ed7c2eceedb0f3f2130fc33c9989b06211196baa1a60396b508bebccb32813ddec7e07b6eb09c5"

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
