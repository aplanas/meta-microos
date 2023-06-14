SUMMARY = "Convergent calculator"
DESCRIPTION = "Kalk is a convergent calculator application built with the Kirigami framework. \
Although it is mainly targeted for mobile platforms, it can also be used on the \
desktop."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalk-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8a40fd9bb5ce32a9c63e4fbd2f5e63b0f9fddaf390c343ddc2f05b9d0d604420aada03e47ce6f7994f795ec5042292407308438f86e78abaef722d2ffc328c08"

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
