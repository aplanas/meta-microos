SUMMARY = "Math Expression Solver and Plotter - mobile version"
DESCRIPTION = "KAlgebra is a math expression solver and plotter. This package includes \
a QtQuick based version for use in mobile (phone, tablet) environments."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalgebra-mobile-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "4ad1db6dee7e547d0d5d4f9facc40666a200eed9df1894c7464b540b5c326087d4489886e68190b31a1c9b6aae83faded6d1c1659bf1c0fad8714fc22871c77e"

RPROVIDES:${PN} += "kalgebra-mobile"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libAnalitza.so.8 \
libAnalitzaPlot.so.8 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
