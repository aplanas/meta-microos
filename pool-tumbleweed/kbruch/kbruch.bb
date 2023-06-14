SUMMARY = "Application to excercise fractions"
DESCRIPTION = "KBruch is an application to learn calculating with fractions."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kbruch-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "210587dcfed30c251bc7dd8a20b4daf17f5110a824ebfbe2e359319a4887844e5ed2eb72b50187d0996b921b8a64cb2161a53837003c36e2ed765e493c7481bd"

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
