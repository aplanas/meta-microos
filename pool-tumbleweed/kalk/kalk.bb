SUMMARY = "Convergent calculator"
DESCRIPTION = "Kalk is a convergent calculator application built with the Kirigami framework. \
Although it is mainly targeted for mobile platforms, it can also be used on the \
desktop."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalk-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "14909e7795f50868e89060c00bdfd3575bca91c25da758bb8aed2125b5bcb461da7da8da02bac1fcaa9066afbd2f984e7f6200aa1954cf6f2c4c711f88357271"

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
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
