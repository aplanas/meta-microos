SUMMARY = "Scientific Calculator"
DESCRIPTION = "KCalc is the KDE calculator tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kcalc-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9eedb9ba3c8e36d460be8723fb40acd94ccdce0f874abcdc0478e6e83bc6aabc38e84c7a91e32bf0f46cffcbd874c1b59080e0a731fe8d4dd19e11af8f51a44d"

RPROVIDES:${PN} += "kcalc \
kcalc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
