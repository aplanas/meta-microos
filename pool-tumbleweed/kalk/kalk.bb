SUMMARY = "Convergent calculator"
DESCRIPTION = "Kalk is a convergent calculator application built with the Kirigami framework. \
Although it is mainly targeted for mobile platforms, it can also be used on the \
desktop."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kalk-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4de7d138e2d760868b239c4bcf95fd46bf141d2d100dafa09b6a6419494dfd0923e3e5e32244afd1ef851d0efc973375ed32d9e3ff25e715cb9ab8ada537fb99"

RPROVIDES:${PN} += "kalk"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5UnitConversion.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgmp.so.10 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
